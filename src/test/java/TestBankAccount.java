import org.junit.jupiter.api.Test;

import static  org.junit.jupiter.api.Assertions.assertEquals;

public class TestBankAccount {
    @Test
    public void testConstructor() {
        BankAccount account1 = new BankAccount(2000, 0, "Lola");
        assertEquals(account1.getBalance(), 2000);
        assertEquals(account1.getMinimumBalance(), 0);
        assertEquals(account1.getAccountHolderName(), "Lola");
    }

    @Test
    public void testDeposit() {
        BankAccount account1 = new BankAccount(50000, 0, "Enrique");
        account1.deposit(1000);
        assertEquals(account1.getBalance(), 51000);
    }

    @Test
    public void testWithdraw() {
        BankAccount account1 = new BankAccount(1000, 0, "Enrique");
        account1.withdraw(2000);
        assertEquals(account1.getBalance(), 1000);
    }

}
