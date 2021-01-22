package bank;

public class Client {
    private String name;
    private short[] accountCode;

    public Client(String name, short[] accountCode) {
        this.name = name;
        this.accountCode = accountCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public short[] getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(short[] accountCode) {
        this.accountCode = accountCode;
    }
}
