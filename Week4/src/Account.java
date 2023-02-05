
/**
 *
 * @author Jarukrit
 */
public class Account {

    public double balance;
    public String name;

    public void deposit(double b) {
        if (balance >= 0) {
            balance += b;
        } else {
            System.out.println("The balance variable must be greater than or equal to zero.");
        }
    }

    public double withdraw(double b) {
        if ((balance >= 0) && (balance - b >= 0)) {
            balance -= b;
            return b;
        } else if (balance - b < 0) {
            System.out.println("Your account balance is insufficient.");
        } else {
            System.out.println("The balance variable must be greater than or equal to zero.");

        }
        return 0;
    }

    public void showInfo() {
        System.out.println("In " + name + " account, there is a balance equal to " + balance + " baht.");
    }
}
