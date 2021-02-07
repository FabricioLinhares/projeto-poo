package bank;

import account.Account;

import java.util.*;

public class  Agency {
    private Set<Account> accounts = new HashSet<>();
    private short numberOfAccounts;
    private List<Client> clients;

    public short createAccount() {
        setNumberOfAccounts((short)(getNumberOfAccounts() + 1));
        return getNumberOfAccounts();
    }

    public double getAppliedMoney() {
        return accounts.stream().mapToDouble(Account::getBalance).sum();
    }

    public short getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void setNumberOfAccounts(short numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
    }


}
