package graphic.client.panels;

import graphic.client.Panels;

import javax.swing.*;

public class AccountHud implements Panels {
    private JButton depositarButton;
    private JButton transferirButton;
    private JButton sacarButton;
    private JButton cadastrarPIXButton;
    private JPanel panel;
    private JLabel accountNumber;

    public void updateAccount(short value) {
        accountNumber.setText("Conta: " + value);
    }

    public JPanel getPanel() {
        return panel;
    }
}
