
public class BankAccount {
    double balance;
    double minimumBalance;
    String accountHolderName;

    public BankAccount(double balance, double minimumBalance, String accountHolderName) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double deposit) {
        balance += deposit;
    }

    public void withdraw(double withdraw) {
       if (balance - withdraw > minimumBalance)
           balance -= withdraw;
       else
           System.out.println("You do not have enough money in your bank account");

    }

    public double getBalance() {
        return balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String toString() {
        return "Account balance: " + String.valueOf(balance);
    }
}
