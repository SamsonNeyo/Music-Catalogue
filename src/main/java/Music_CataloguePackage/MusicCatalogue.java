package Music_CataloguePackage;

import javax.swing.*;
import java.awt.*;

public class MusicCatalogue {
    JFrame mainFrame;
    JPanel sidePanel;
    String[] categories = {"Reggae", "Ballads", "Rap"};
    public MusicCatalogue() {
        this.prepareLayoutBorder();
        this.prepareHeader();
        this.prepareSidePanel();
    }
    public JFrame prepareLayoutBorder() {
        mainFrame = new JFrame("Music Catalogue");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800, 500);
        mainFrame.setLayout(new BorderLayout());

        mainFrame.setVisible(true);
        return mainFrame;
    }


    //method for a header NORTH
    public JFrame prepareHeader() {
        // Top Panel (NORTH) - Title
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(217,217,217));
        topPanel.setPreferredSize(new Dimension(800, 50));
        JLabel titleLabel = new JLabel("My Music Catalogue");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        topPanel.add(titleLabel);
        mainFrame.add(topPanel, BorderLayout.NORTH);

        return  mainFrame;
    }

    public JFrame prepareSidePanel(){
        sidePanel = new JPanel(new GridLayout(3, 1, 10, 10));
        sidePanel.setBackground(new Color(255, 255, 233));

        for (String category : categories) {
            JButton btn = new JButton(category);
            btn.setBackground(new Color(10, 50, 80));
            btn.setForeground(Color.WHITE);
            sidePanel.add(btn);
        }
        mainFrame.add(sidePanel, BorderLayout.WEST);

        return mainFrame;
    }

}
