package account;

import bank.PixKey;

import java.util.Calendar;

public abstract class Account {
    protected double balance;
    private final short code;
    private Calendar data;

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

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
}
