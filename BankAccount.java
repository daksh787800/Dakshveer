public class BankAccount {
    // Private variable to store account balance
    private double balance;

    // Constructor to initialize balance to 0
    public BankAccount() {
        balance = 0;
    }

    // Public method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Protected method to withdraw money from the account
    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Default-access method to check balance
    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        // Create an object of BankAccount class
        BankAccount account = new BankAccount();
        
        // Access the public method (deposit)
        account.deposit(1000);
        
        // Access the default-access method (checkBalance)
        account.checkBalance();
        
        // Access the protected method (withdraw) within the same class
        account.withdraw(500);
        
        // Check the balance again
        account.checkBalance();
        
        // Uncommenting the following line will cause a compile-time error
        // because 'balance' is a private variable.
        // System.out.println(account.balance);
    }
}
