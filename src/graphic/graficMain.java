package graphic;

import graphic.client.panels.AccountHud;
import graphic.client.panels.ClientHud;

import javax.swing.*;
import java.awt.*;

public class graficMain extends JFrame {
    JPanel cards;

    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuCentralBank = new JMenu("Banco Central");
        JMenu menuBank = new JMenu("Banco");
        JMenu menuAgency = new JMenu("Agência");
        JMenu menuClient = new JMenu("Cliente");

        menuBar.add(menuCentralBank);
        menuBar.add(menuBank);
        menuBar.add(menuAgency);
        menuBar.add(menuClient);

        return menuBar;
    }

    public graficMain() {
        setTitle("PIX");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJMenuBar(createMenu());

        cards = new JPanel(new CardLayout());

        JPanel accountCard = (new AccountHud()).getPanel();
        JPanel clientCard = (new ClientHud(cards)).getPanel();

        //cards.add(clientCard);
        //cards.add(accountCard, ACCOUNTPANEL);

        getContentPane().add(cards, BorderLayout.CENTER);
        pack();
        setVisible(true);
        setSize(400, 200);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(graficMain::new);
    }
}
