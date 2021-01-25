package bank;

import java.util.*;

public class Client {
    private String name;
    private List<Short> accountCodes;

    public Client(String name, Short accountCode) {
        this.name = name;
        accountCodes = new ArrayList<Short>();
        accountCodes.add(accountCode);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
