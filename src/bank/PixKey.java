package bank;

public class PixKey implements PixTypes {
    private final byte type;
    private final String value;
    private final String owner;
    private final byte bank;
    private final byte agency;
    private final byte account;

    public PixKey(byte type, String value, String owner, byte bank, byte agency, byte account) {
        this.type = type;
        this.value = value;
        this.owner = owner;
        this.bank = bank;
        this.agency = agency;
        this.account = account;
    }

    public String getType() {
        String typeString;

        switch (type) {
            case EMAIL_TYPE:
                typeString = "Email";
            case PHONE_TYPE:
                typeString = "Telefone";
            case RANDOM_CODE_TYPE:
                typeString = "Chave aleatório";
            default:
                typeString = "Inválido";
        }

        return typeString;
    }

    public String getValue() {
        return value;
    }

    public String getOwner() {
        return owner;
    }

    public byte getBank() {
        return bank;
    }

    public byte getAgency() {
        return agency;
    }

    public byte getAccount() {
        return account;
    }
}
