package bank;

import account.Account;
import account.CurrentAccount;
import account.SalaryAccount;
import account.SavingAccount;

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
        SalaryAccount salaryAccount = new SalaryAccount(0.0, (short)accounts.size());
        accounts.add(salaryAccount);
        return salaryAccount;
    }

    private SavingAccount creatSavingAccount() {
        SavingAccount savingAccount = new SavingAccount(0.0, (short)accounts.size());
        accounts.add(savingAccount);
        return savingAccount;
    }

    private CurrentAccount creatCurrentAccount() {
        CurrentAccount currentAccount = new CurrentAccount(0.0, (short)accounts.size());
        accounts.add(currentAccount);
        return currentAccount;
    }

    public int numberOfAccounts() {
        return accounts.size();
    }

    public double getAppliedMoney() {
        return accounts.stream().mapToDouble(Account::getBalance).sum();
    }

    public double getClientMoney(short clientId) {
        double clientMoney=0;

        Client client = clients.get(clientId);
        List<Short> accountCodes = client.getAccountCodes();

        clientMoney = accountCodes.stream().mapToDouble(code -> accounts.get(code).getBalance()).sum();

        return clientMoney;
    }
}
