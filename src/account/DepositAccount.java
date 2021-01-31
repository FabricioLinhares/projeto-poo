package account;

public abstract class DepositAccount extends Account {

    public DepositAccount (double balance, short code){
        super(balance, code);
    }

    public void deposit(double value) {
        balance = getBalance() + value;
    }

}
