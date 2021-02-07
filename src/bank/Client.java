package bank;

import java.util.*;

public class Client {
    private String name;
    private List<Short> accountCodes;
    private short id;

    public Client(String name, short id, Short accountCode) {
        this.name = name;
        this.id = id;
        accountCodes = new ArrayList<Short>();
        accountCodes.add(accountCode);
    }

    public String getName() {
        return name;
    }

    public short getId() {
        return id;
    }

    public List<Short> getAccountCodes() {
        return accountCodes;
    }
}
