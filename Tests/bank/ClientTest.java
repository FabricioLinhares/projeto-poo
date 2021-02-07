package bank;

import account.CurrentAccount;
import account.SavingAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void getAppliedMoneyAndAddAccount() {
        Agency agencia = new Agency((short)0);
        CurrentAccount contaCorrente;
        contaCorrente = (CurrentAccount) agencia.createAccount((byte)1);

        Client client1= agencia.createClient("Raul",contaCorrente);
        contaCorrente.deposit(1000.0);

        SavingAccount contaPoupança;
        contaPoupança = (SavingAccount) agencia.createAccount((byte)2);
        contaPoupança.deposit(1700.0);

        client1.addAccount(contaPoupança);

        assertEquals(2700.0,client1.getAppliedMoney());
    }
}