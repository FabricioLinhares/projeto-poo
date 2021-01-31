package account;

import bank.PixKey;

public abstract class Account {
    protected double balance;
    private final short code;

    public Account(double balance, short code) {
        this.balance = balance;
        this.code = code;
    }

    public double getBalance() {
        return balance;
    }

    public short getCode() {
        return code;
    }
}
