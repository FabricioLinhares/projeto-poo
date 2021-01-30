package graphic.account.panels;

import graphic.account.CardPanel;
import graphic.account.Panels;

import javax.swing.*;

public class ClientHud extends CardPanel implements Panels {
    private JPanel panel;
    private JComboBox comboBox1;
    private JButton entrarButton;

    public ClientHud(JPanel parent) {
        super(parent);
        setSize(300, 500);

        addChangeButton(entrarButton, ACCOUNTPANEL);
    }

    public JPanel getPanel() {
        return panel;
    }
}