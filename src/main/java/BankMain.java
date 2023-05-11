public class BankMain {
    public static void main(String[] args) {
        //BankAccount objects created
        BankAccount account = new BankAccount(500.0, "James Benedict Esquire");
        BankAccount account1 = new BankAccount(5000.0, "Dane Tarquin Fahnestock");
        BankAccount account2 = new BankAccount(300.0, "Olivier Von Stucke Plushbotham VI");

        //BankAccount objects invoking methods
        account.deposit(100.0);
        account1.withdrawal(100.0);
        account2.deposit(100.0);

        account.printAccountDetails();
        account1.printAccountDetails();
        account2.printAccountDetails();
    }
}

