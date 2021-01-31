package graphic.client.panels;

import graphic.client.CardPanel;
import graphic.client.Panels;

import javax.swing.*;

public class ClientHud extends CardPanel implements Panels {
    private JPanel panel;
    private JComboBox comboBox1;
    private JButton entrarButton;

    public ClientHud(JPanel parent) {
        super(parent);
        setChangeButton(entrarButton, ACCOUNTPANEL);
    }

    @Override
    public void setChangeButton(JButton button, String action) {
        super.setChangeButton(button, action);
    }

    public JPanel getPanel() {
        return panel;
    }
}