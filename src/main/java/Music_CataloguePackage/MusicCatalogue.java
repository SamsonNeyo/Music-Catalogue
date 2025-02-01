package Music_CataloguePackage;

import javax.swing.*;
import java.awt.*;

public class MusicCatalogue {
    JFrame mainFrame;
    JPanel sidePanel;
    String[] categories;

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
        topPanel.setBackground(Color.LIGHT_GRAY);
        JLabel titleLabel = new JLabel("My Music Catalogue");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        topPanel.add(titleLabel);
        mainFrame.add(topPanel, BorderLayout.NORTH);

        return mainFrame;
    }

    public JFrame prepareSidePanel() {
        // Sidebar (WEST) - Category Buttons
        sidePanel = new JPanel();
        sidePanel.setLayout(new GridLayout(3, 1, 10, 10));
        sidePanel.setBackground(new Color(40, 55, 70)); // Dark Blue
        categories = new String[]{"Reggae", "Ballads", "Rap"};

        for (String category : categories) {
            JButton btn = new JButton(category);
            btn.setBackground(Color.LIGHT_GRAY);
            btn.setForeground(Color.DARK_GRAY);
            sidePanel.add(btn);
        }
        mainFrame.add(sidePanel, BorderLayout.WEST);

        return mainFrame;

    }
}
