public class BankAccount {//Class with 2 attributes
    public double balance;
    public String accountHolderName;

    //Constructor
    public BankAccount(double balance, String accountHolderName) {
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    //Methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    public void printAccountDetails() {
        System.out.println(accountHolderName + " Account Balance: $" + balance);
    }
}
