package account;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrentAccountTest {

    @Test
    void deposit() {
        CurrentAccount contaTeste = new CurrentAccount(0.0,(short)3433);

        contaTeste.deposit(50.0);

        assertEquals(50.0,contaTeste.getBalance(),0.01);
    }

    @Test
    void getCode() {
        CurrentAccount contaTeste = new CurrentAccount(0.0,(short)3433);

        assertEquals((short)3433,contaTeste.getCode());
    }
}