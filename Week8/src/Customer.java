
import java.util.ArrayList;

/**
 *
 * @author Jarukrit
 */
public class Customer {

//    private String firstName;
//    private String lastName;
//    private ArrayList<Account> acct;
//    private int numOfAccount;
//
//    public Customer() {
//        this("", "");
//
//    }
//
//    public Customer(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        acct = new ArrayList<>();
//    }
//
//    public void addAccount(Account acct) {
//        this.acct.add(acct);
//        numOfAccount++;
//    }
//
//    public Account getAccount(int index) {
//        return acct.get(index);
//    }
//
//    public int getNumOfAccount() {
//        return acct.size();
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    @Override
//    public String toString() {
//        return getFirstName() + " " + getLastName() + " account has " + getNumOfAccount() + " associated accounts.";
//    }
//
//    public boolean equals(Customer c) {
//        return (getFirstName().equals(c.getFirstName()) && getLastName().equals(c.getLastName()));
//    }




    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;

    public Customer() {
        this("", "");

    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
    }

    public void addAccount(Account acct) {
        this.acct[numOfAccount] = acct;
        numOfAccount++;
    }

    public Account getAccount(int index) {
        return acct[index];
    }

    public int getNumOfAccount() {
        return numOfAccount;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " account has " + getNumOfAccount() + " associated accounts.";
    }

    public boolean equals(Customer c) {
        return (getFirstName().equals(c.getFirstName()) && getLastName().equals(c.getLastName()));
    }
}
