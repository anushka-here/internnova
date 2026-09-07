package week3;

public class task3 {
    
    static class BankAccount {
    String accountHolderName;
    long accountNumber;
    double balance;

    // Static variable
    static int totalAccounts = 0;

    // Constructor
    BankAccount(String accountHolderName, long accountNumber, double balance) {

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;

        totalAccounts++;
    }

    void displayAccount() {
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
        System.out.println("----------------------------");
    }
}

class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(
                "Anushka",
                10001,
                25000
        );

        BankAccount a2 = new BankAccount(
                "Rahul",
                10002,
                30000
        );

        BankAccount a3 = new BankAccount(
                "Priya",
                10003,
                45000
        );

        System.out.println("===== BANK ACCOUNT DETAILS =====");

        a1.displayAccount();
        a2.displayAccount();
        a3.displayAccount();

        System.out.println("Total Number of Accounts : "
                + BankAccount.totalAccounts);
    }
}
}
