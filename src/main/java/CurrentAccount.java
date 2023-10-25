public class CurrentAccount extends BankAccount {

    double maxWithdrawal;
    public CurrentAccount(double balance, double minimumBalance, String accountHolderName,double maxWithdrawal) {
        super(balance, minimumBalance, accountHolderName);
        this.maxWithdrawal = maxWithdrawal;
    }
    @Override
    public void withdraw(double withdraw) {
        if (balance - withdraw > minimumBalance && withdraw <= maxWithdrawal)
            balance -= withdraw;
        else
            System.out.println("You do not have enough money in your bank account");
    }

}
