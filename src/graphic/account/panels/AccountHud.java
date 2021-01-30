package graphic.account.panels;

import graphic.account.Panels;

import javax.swing.*;

public class AccountHud implements Panels {
    private JButton depositarButton;
    private JButton transferirButton;
    private JButton sacarButton;
    private JButton cadastrarPIXButton;
    private JPanel panel;

    /*public AccountHud() {
        add(panel);

        setTitle("Hud Account");
        setSize(400, 500);
    }*/

    public JPanel getPanel() {
        return panel;
    }
}
