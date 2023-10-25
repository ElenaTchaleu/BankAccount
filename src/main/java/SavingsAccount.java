public class SavingsAccount extends BankAccount{
    double interestRate;

    public SavingsAccount(double balance, double minimumBalance, String accountHolderName, double interestRate) {
        super (balance, minimumBalance, accountHolderName);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double deposit) {
        balance = (balance + deposit) * interestRate;
    }


}
