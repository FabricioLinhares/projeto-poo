package graphic;

import bank.Agency;
import bank.Bank;
import graphic.client.panels.AccountHud;
import graphic.client.panels.ClientHud;
import graphic.dialogs.MessageDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraficMain extends JFrame {
    private Bank bank = new Bank();
    private Agency agency = new Agency();

    JPanel cards;

    private JMenuItem addMenuItem(JMenu parent, String name) {
        JMenuItem menuItem = new JMenuItem(name);
        parent.add(menuItem);

        return menuItem;
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuCreate = new JMenu("Criar");
        addMenuItem(menuCreate, "Agência");
        addMenuItem(menuCreate, "Conta");

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

        addMenuItem(menuOthers, "Mudar conta");

        menuBar.add(menuCreate);
        menuBar.add(menuOthers);

        return menuBar;
    }

    public GraficMain() {
        setTitle("PIX");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJMenuBar(createMenuBar());

        cards = new JPanel(new CardLayout());

        JPanel accountCard = (new AccountHud()).getPanel();
        JPanel clientCard = (new ClientHud(cards)).getPanel();

        cards.add(accountCard);
        cards.add(clientCard, "Client");
        cards.add(clientCard, "Bank");

        getContentPane().add(cards, BorderLayout.CENTER);
        pack();
        setVisible(true);
        setSize(400, 200);
    }

    class ChangeCardlayoutListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            CardLayout layout = (CardLayout) (cards.getLayout());
            layout.show(cards, (String) evt.getActionCommand());
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(GraficMain::new);
    }
}
