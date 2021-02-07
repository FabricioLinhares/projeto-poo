package bank;

import account.Account;

import java.util.*;

public class  Agency {
    private final short code;
    private final List<Account> accounts;
    private final List<Client> clients;

    public Agency(short code) {
        this.code = code;
        this.accounts = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public short createAccount() {
         return 1;
    }

    public double getAppliedMoney() {
        return accounts.stream().mapToDouble(Account::getBalance).sum();
    }
}
