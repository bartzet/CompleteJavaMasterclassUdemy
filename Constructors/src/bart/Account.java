package bart;

/**
 * Created by Dell on 2017-09-15.
 */
public class Account {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    //Constructor
    public Account() {
        System.out.println("Empty constructor called");
    }

    //Antoher constructor
    public Account(int accountNumber, double accountBalance, String customerName, String email, int phoneNumber ) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public void depositFunds(double depositAmount) {
        this.accountBalance = accountBalance + depositAmount;
        System.out.println("Deposit of: " + depositAmount + " New balance is " + this.accountBalance);
    }

    public void withdrawFunds(double withdrawAmount) {
        // test I have a sufficient funds
        if (accountBalance - withdrawAmount <= 0) {
            System.out.println("Only " + this.accountBalance + " available. Withdraw not processed.");
        } else {
            this.accountBalance = accountBalance - withdrawAmount;
            System.out.println("Withdraw of " + withdrawAmount + " successful. Remaining balance: " + this.accountBalance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

