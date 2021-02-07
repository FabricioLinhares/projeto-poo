package graphic;

import account.Account;

import javax.swing.*;

public class AccountHud {
    private Account account;
    private JButton depositarButton;
    private JButton transferirButton;
    private JButton sacarButton;
    private JButton cadastrarPIXButton;
    private JPanel panel;
    private JLabel accountNumber;

    public AccountHud(Account account) {
        this.account = account;
    }

    public void updateAccount(short value) {
        accountNumber.setText("Conta: " + value);
    }

    public JPanel getPanel() {
        return panel;
    }
}
