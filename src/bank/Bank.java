package bank;

public class Bank {
    private int numberOfAccounts;

    public int createAccount() {
        setNumberOfAccounts(getNumberOfAccounts() + 1);
        return getNumberOfAccounts();
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void setNumberOfAccounts(int numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
    }
}
