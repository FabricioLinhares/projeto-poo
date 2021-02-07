package graphic.dialogs;

import javax.swing.*;

public class MessageDialog extends JDialog {
    private JPanel contentPane;
    private JLabel message;

    public MessageDialog(String text) {
        setContentPane(contentPane);
        setModal(true);
        message.setText(text);
    }
}
