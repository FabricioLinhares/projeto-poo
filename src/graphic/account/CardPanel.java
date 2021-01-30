package graphic.account;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

abstract public class CardPanel extends JFrame {
    private final JPanel parent;

    public CardPanel(JPanel parent) {
        this.parent = parent;
    }

    public void addChangeButton(JButton button, String action) {
        button.setActionCommand(action);
        button.addActionListener(new ChangeCardlayoutListener());
    }

    class ChangeCardlayoutListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            CardLayout layout = (CardLayout) (parent.getLayout());
            layout.show(parent, (String) evt.getActionCommand());
        }
    }
}
