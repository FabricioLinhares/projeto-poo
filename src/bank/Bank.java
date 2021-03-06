package bank;

import account.Account;

import java.util.*;

public class Bank {
    private final List<Agency> agencys = new ArrayList<>();

    public double getAppliedMoney() {
        return agencys.stream().mapToDouble(Agency::getAppliedMoney).sum();
    }

    public short createAgency() {
        short nextCode = (short) agencys.size();
        Agency newAgency = new Agency(nextCode);

        agencys.add(newAgency);

        return nextCode;
    }

    public Agency getAgency(int id) {
        return agencys.get(id);
    }

    public int getNumberOfAgencys() {
        return agencys.size();
    }
}
