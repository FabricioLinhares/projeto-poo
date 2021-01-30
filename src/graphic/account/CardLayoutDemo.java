package graphic.account;

import graphic.account.panels.AccountHud;
import graphic.account.panels.ClientHud;

import java.awt.*;
import javax.swing.*;

public class CardLayoutDemo extends JFrame implements Panels {
    JPanel cards;

    public CardLayoutDemo() {

        setTitle("CardLayoutDemo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cards = new JPanel(new CardLayout());

        JPanel accountCard = (new AccountHud()).getPanel();
        JPanel clientCard = (new ClientHud(cards)).getPanel();

        cards.add(clientCard);
        cards.add(accountCard, ACCOUNTPANEL);

        getContentPane().add(cards, BorderLayout.CENTER);
        pack();
        setVisible(true);
        setSize(400, 200);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(CardLayoutDemo::new);
    }
}