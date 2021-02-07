package bank;

import account.Account;
import account.CurrentAccount;
import account.SalaryAccount;
import account.SavingAccount;

import java.util.*;

public class  Agency {
    private final short code;
    private short numberOfAccounts;
    private final List<Client> clients;

    public Agency(short code) {
        this.numberOfAccounts = 0;
        this.code = code;
        this.clients = new ArrayList<>();
    }

    public short creatClient(String name, Account account) {
        return 1;
    }

    public Account creatAccount(byte number) {
        switch (number) {
            case 1:
                return creatCurrentAccount();
            case 2:
                return creatSavingAccount();
            case 3:
                return creatSalaryAccount();
            default:
                return null;
        }
    }

    private SalaryAccount creatSalaryAccount() {
        SalaryAccount salaryAccount = new SalaryAccount(0.0, numberOfAccounts);
        numberOfAccounts++;
        return salaryAccount;
    }

    private SavingAccount creatSavingAccount() {
        SavingAccount savingAccount = new SavingAccount(0.0, numberOfAccounts);
        numberOfAccounts++;
        return savingAccount;
    }

    private CurrentAccount creatCurrentAccount() {
        CurrentAccount currentAccount = new CurrentAccount(0.0, numberOfAccounts);
        numberOfAccounts++;
        return currentAccount;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public int getNumberOfClients() {
        return clients.size();
    }

    public double getAppliedMoney() {
        return clients.stream().mapToDouble(Client::getAppliedMoney).sum();
    }

    public Client getClient(int id) {
        return clients.get(id);
    }
}
