package graphic;

import bank.Bank;
import graphic.client.CardPanel;
import graphic.client.panels.AccountHud;
import graphic.client.panels.ClientHud;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class graficMain extends JFrame implements menuActionHandler {
    private Bank bank;

    JPanel cards;

    private void addMenuItem(JMenu parent, String name, String actionCommand) {
        JMenuItem menuItem = new JMenuItem(name);
        menuItem.setActionCommand(actionCommand);
        menuItem.addActionListener(new ChangeCardlayoutListener());

        parent.add(menuItem);
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuCreate = new JMenu("Criar");
        addMenuItem(menuCreate, "Agência", CREATE_AGENCY);
        addMenuItem(menuCreate, "Conta", CREATE_ACCOUNT);

        JMenu menuOthers = new JMenu("Outros");
        addMenuItem(menuOthers, "Ver dinheiro aplicado no Banco", SHOW_APPLIED_MONEY_BANK);
        addMenuItem(menuOthers, "Ver dinheiro aplicado na Agência", SHOW_APPLIED_MONEY_AGENCY);
        addMenuItem(menuOthers, "Mudar conta", CHANGE_ACCOUNT);

        menuBar.add(menuCreate);
        menuBar.add(menuOthers);

        return menuBar;
    }

    public graficMain() {
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
        javax.swing.SwingUtilities.invokeLater(graficMain::new);
    }
}
