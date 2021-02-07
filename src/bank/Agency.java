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

    public Client createClient(String name, Account account) {
        Client client = new Client(name,(short)clients.size(),account);
        clients.add(client);
        return client;
    }

    public Account createAccount(byte number) {
        switch (number) {
            case 1:
                return createCurrentAccount();
            case 2:
                return createSavingAccount();
            case 3:
                return createSalaryAccount();
            default:
                return null;
        }
    }

    private SalaryAccount createSalaryAccount() {
        SalaryAccount salaryAccount = new SalaryAccount(0.0, numberOfAccounts);
        numberOfAccounts++;
        return salaryAccount;
    }

    private SavingAccount createSavingAccount() {
        SavingAccount savingAccount = new SavingAccount(0.0, numberOfAccounts);
        numberOfAccounts++;
        return savingAccount;
    }

    private CurrentAccount createCurrentAccount() {
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
