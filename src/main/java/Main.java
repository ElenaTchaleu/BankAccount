public class Main {
        public static void main(String[] args) {
            BankAccount account1 = new CurrentAccount(30000, 100, "Igor", 2000);
            BankAccount account2 = new SavingsAccount(50000, 500, "Greg", 0.5);
            BankAccount[] accounts = {account1, account2};
            for (BankAccount a: accounts) {
                System.out.println(a.toString());
            }

    }
}
