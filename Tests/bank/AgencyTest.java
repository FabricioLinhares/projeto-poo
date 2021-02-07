package bank;

import account.CurrentAccount;
import account.SalaryAccount;
import account.SavingAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgencyTest {

    @Test
    void getAppliedMoney() {

        Agency agencia = new Agency((short)0);
        CurrentAccount contaCorrente;
        contaCorrente = (CurrentAccount) agencia.createAccount((byte)1);

        Client client1= agencia.createClient("Raul",contaCorrente);

        contaCorrente.deposit(1000.0);

        SavingAccount contaPoupança;
        contaPoupança = (SavingAccount) agencia.createAccount((byte)2);

        Client client2= agencia.createClient("Fabricio",contaPoupança);

        contaPoupança.deposit(1000.0);
        assertEquals(2000.0,agencia.getAppliedMoney());

    }

    @Test
    void numberOfAccounts() {
        Agency agencia = new Agency((short)0);
        SavingAccount contaPoupança;
        contaPoupança = (SavingAccount) agencia.createAccount((byte)2);

        SalaryAccount contaSalario;
        contaSalario = (SalaryAccount) agencia.createAccount((byte)3);

        assertEquals(2,agencia.getNumberOfAccounts());
    }
}