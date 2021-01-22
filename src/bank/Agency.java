package bank;

import java.util.List;

public class Agency {
    private List<Integer> account;
    private short numberOfAccounts;

    public short createAccount() {
        numberOfAccounts += 1;
        return numberOfAccounts;
    }

    public List<Integer> getContas() {
        return account;
    }

    public void setContas(List<Integer> account) {
        this.account = account;
    }

    public short getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void setNumberOfAccounts(short numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
    }
}
