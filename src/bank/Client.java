package bank;

import account.Account;

import java.util.*;

public class Client {
    private final String name;
    private final List<Account> accounts;
    private final short id;

    public Client(String name, short id, Account account) {
        this.name = name;
        this.id = id;
        accounts = new ArrayList<>();
        accounts.add(account);
    }

    public String getName() {
        return name;
    }

    public short getId() {
        return id;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public double getAppliedMoney() {
        return accounts.stream().mapToDouble(Account::getBalance).sum();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }
}