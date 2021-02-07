package bank;

import account.Account;
import account.CurrentAccount;
import account.SalaryAccount;
import account.SavingAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgencyTest {

    @Test
    void creatAccount() {

        Agency agencia = new Agency((short)0);
        CurrentAccount contaCorrente;
        contaCorrente = (CurrentAccount) agencia.creatAccount((byte)1);

        contaCorrente.deposit(1000.0);
        assertEquals(1000.0,agencia.getAppliedMoney());

    }

    @Test
    void getAppliedMoney() {
        Agency agencia = new Agency((short)0);
        SavingAccount contaPoupança;
        contaPoupança = (SavingAccount) agencia.creatAccount((byte)2);

        SalaryAccount contaSalario;
        contaSalario = (SalaryAccount) agencia.creatAccount((byte)3);

        assertEquals(2,agencia.numberOfAccounts());
    }
}