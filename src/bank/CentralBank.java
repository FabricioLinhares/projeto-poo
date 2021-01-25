package bank;

import java.util.*;

public class CentralBank {
    private static List<PixKey> pixKeys;
    private static List<Bank> banks;

    public CentralBank() {
        pixKeys = new ArrayList<PixKey>();
        banks = new ArrayList<Bank>();
    }

    public String registerPix(byte type, String owner, byte bankCode, byte agencyCode, byte accountCode) {

    }

    public boolean removePix(String key) {

    }

    public PixKey getPix(String key) {

    }

    public byte registerBank() {

    }

    public boolean removeBank(byte bankCode) {

    }

    public Bank getBank(byte bankCode) {

    }
}
