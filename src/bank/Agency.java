package bank;

import java.util.*;

public class Agency {
    private List<Integer> account;
    private short numberOfAccounts;
    private List<Client> clients;

    public short createAccount() {
        setNumberOfAccounts((short)(getNumberOfAccounts() + 1));
        return getNumberOfAccounts();
    }

    public short getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void setNumberOfAccounts(short numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
    }


}
