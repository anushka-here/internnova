package week3;

public class task6 {
    
    // Encapsulation
class BankAccount {

    private long accountNumber;
    private String accountHolderName;
    private double balance;

    // Getter for account number
    public long getAccountNumber() {
        return accountNumber;
    }

    // Setter for account number
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter for account holder name
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : " + balance);
    }
}

// Abstraction
abstract class Account {

    // Abstract method
    abstract void calculateInterest();

    // Normal method
    void showMessage() {
        System.out.println("This is a bank account.");
    }
}

// Child class
class SavingsAccount extends Account {

    @Override
    void calculateInterest() {
        System.out.println("Interest calculated for Savings Account.");
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        System.out.println("===== ENCAPSULATION =====");

        BankAccount account = new BankAccount();

        account.setAccountNumber(10001);
        account.setAccountHolderName("Anushka");
        account.setBalance(50000);

        account.displayDetails();

        System.out.println();

        System.out.println("===== ABSTRACTION =====");

        SavingsAccount savings = new SavingsAccount();

        savings.showMessage();
        savings.calculateInterest();
    }
}
}
