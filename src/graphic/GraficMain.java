package graphic;

import bank.Agency;
import bank.Bank;
import graphic.dialogs.ChangeAccountDialog;
import graphic.dialogs.MessageDialog;

import javax.swing.*;
import java.awt.*;

public class GraficMain extends JFrame {
    private Bank bank = new Bank();
    private Agency agency;

    private JMenuItem addMenuItem(JMenu parent, String name) {
        JMenuItem menuItem = new JMenuItem(name);
        parent.add(menuItem);

        return menuItem;
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuCreate = new JMenu("Criar");

        JMenuItem menuCreateAgency = addMenuItem(menuCreate, "Agência");
        menuCreateAgency.addActionListener(e -> {
            short agencyId = bank.createAgency();

            MessageDialog dialog = new MessageDialog("Agência nº" + agencyId + " criada!");
            dialog.pack();
            dialog.setVisible(true);
        });

        JMenuItem menuCreateClient = addMenuItem(menuCreate, "Cliente");
        menuCreateClient.addActionListener(e -> {
            int numberOfAgencys = bank.getNumberOfAgencys();


        });

        JMenu menuOthers = new JMenu("Outros");

        JMenuItem menuMoneyAppliedBank = addMenuItem(menuOthers, "Ver dinheiro aplicado no Banco");
        menuMoneyAppliedBank.addActionListener(e -> {
            MessageDialog dialog = new MessageDialog("R$" + bank.getAppliedMoney());
            dialog.pack();
            dialog.setVisible(true);
        });

        JMenuItem menuMoneyAppliedAgency = addMenuItem(menuOthers, "Ver dinheiro aplicado na Agência");
        menuMoneyAppliedAgency.addActionListener(e -> {
            MessageDialog dialog = new MessageDialog("R$" + agency.getAppliedMoney());
            dialog.pack();
            dialog.setVisible(true);
        });

        JMenuItem menuChangeAccount = addMenuItem(menuOthers, "Mudar conta");

        menuChangeAccount.addActionListener(e -> {
            ChangeAccountDialog dialog = new ChangeAccountDialog(bank);
            dialog.pack();
            dialog.setVisible(true);
        });

        menuBar.add(menuCreate);
        menuBar.add(menuOthers);

        return menuBar;
    }

    public GraficMain() {
        setTitle("PIX");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJMenuBar(createMenuBar());

        AccountHud accountHud = new AccountHud(null);

        getContentPane().add(accountHud.getPanel(), BorderLayout.CENTER);
        pack();
        setVisible(true);
        setSize(400, 200);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(GraficMain::new);
    }
}
