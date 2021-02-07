package graphic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuActionsListener implements ActionListener, menuActionHandler {
    private void showDialog(String dialogName) {

    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();

        showDialog(actionCommand);
    }
}
