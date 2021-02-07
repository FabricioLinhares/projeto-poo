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
        contaCorrente = (CurrentAccount) agencia.creatAccount((byte)1);

        contaCorrente.deposit(1000.0);
        assertEquals(1000.0,agencia.getAppliedMoney());

    }

    @Test
    void numberOfAccounts() {
        Agency agencia = new Agency((short)0);
        SavingAccount contaPoupança;
        contaPoupança = (SavingAccount) agencia.creatAccount((byte)2);

        SalaryAccount contaSalario;
        contaSalario = (SalaryAccount) agencia.creatAccount((byte)3);

        assertEquals(2,agencia.getNumberOfAccounts());
    }

    @Test
    void getClientMoney() {
        Agency agencia = new Agency((short)0);
        SavingAccount contaPoupança;
        contaPoupança = (SavingAccount) agencia.creatAccount((byte)2);

        CurrentAccount contaCorrente2;
        contaCorrente2 = (CurrentAccount) agencia.creatAccount((byte)1);

        CurrentAccount contaCorrente;
        contaCorrente = (CurrentAccount) agencia.creatAccount((byte)1);

        contaCorrente.deposit(1000.0);
        contaCorrente2.deposit(100.0);
        contaPoupança.deposit(300.0);
    }
}