
/**
 *
 * @author Jarukrit
 */
public class Main01 {

    public static void main(String[] args) {
        Bank myBank = new Bank();
        Account acct1 = new Account(5000, "Sommai");
        Account acct2 = new Account(3000, "Somchai");
        Account acct3 = new Account(900, "Somsri");
        myBank.addAccount(acct1);
        myBank.addAccount(acct2);
        myBank.addAccount(acct3);
        System.out.println("Number of Account: " + myBank.getNumAccount());
        myBank.getAccount(0).showAccount();
        System.out.println("Deposit 500...");
        myBank.getAccount(0).deposit(500);
        myBank.getAccount(0).showAccount();
        System.out.println("\n= Displaying all accounts ====");
        for (int i = 0; i < myBank.getNumAccount(); i++) {
            myBank.getAccount(i).showAccount();
        }
        System.out.println("================================");

    }
}
