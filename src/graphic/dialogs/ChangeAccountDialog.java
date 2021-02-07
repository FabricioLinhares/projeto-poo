package graphic.dialogs;

import account.Account;
import bank.Agency;
import bank.Bank;
import bank.Client;

import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.List;

public class ChangeAccountDialog extends JDialog {
    private final Bank bank;

    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JComboBox comboBoxAgency;
    private JComboBox comboBoxAccount;
    private JComboBox comboBoxClient;

    public ChangeAccountDialog(Bank bank) {
        this.bank = bank;
        updateAgencyOptions();

        comboBoxAgency.addActionListener(e -> {
            updateClientOptions();
        });

        comboBoxClient.addActionListener(e -> {
            updateAccountOptions();
        });

        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private String[] normalizeOptions(String defaultString, int ammount) {
        String[] options = new String[ammount];

        for(short i=0; i < ammount; i++) {
            options[i] = defaultString + i;
        }

        return options;
    }

    private void updateAgencyOptions() {
        int numberOfAgencys = bank.getNumberOfAgencys();
        String[] options = normalizeOptions("Agência nº", numberOfAgencys);
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(options);

        comboBoxAgency.setModel(model);
    }

    private void updateClientOptions() {
        int agencyId = comboBoxAgency.getSelectedIndex();
        Agency selectedAgency = bank.getAgency(agencyId);

        int numbersOfClients = selectedAgency.getNumberOfClients();
        String[] options = normalizeOptions("Cliente nº", numbersOfClients);
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(options);

        comboBoxAgency.setModel(model);
    }

    private void updateAccountOptions() {
        int agencyId = comboBoxAgency.getSelectedIndex();
        Agency selectedAgency = bank.getAgency(agencyId);

        int clientId = comboBoxClient.getSelectedIndex();
        Client selectedClient = selectedAgency.getClient(clientId);

        List<Account> accountsList = selectedClient.getAccounts();
        Account[] accountsArray = accountsList.toArray(new Account[accountsList.size()]);

        String[] options = new String[accountsArray.length];
        for(int i=0; i < accountsArray.length; i++) {
            options[i] = "Conta nº" + accountsArray[i];
        }
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(options);

        comboBoxAgency.setModel(model);
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }
}
