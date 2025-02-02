package Music_CataloguePackage;

import javax.swing.*;
import java.awt.*;

public class MusicCatalogue {
    JFrame mainFrame;
    JPanel sidePanel, bottomPanel;
    String[] categories = {"Reggae", "Ballads", "Rap"};
    JButton submitButton, exitButton;

    public MusicCatalogue() {
        this.prepareLayoutBorder();
        this.prepareHeader();
        this.prepareSidePanel();
        this.prepareBottomPanel();
    }
    public JFrame prepareLayoutBorder() {
        mainFrame = new JFrame("Music Catalogue");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800, 600);
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
<<<<<<< HEAD
        sidePanel.setPreferredSize(new Dimension(100, 5));
=======

>>>>>>> parent of e16c1af (sidePanel has been added width 100 and height of 2)
        for (String category : categories) {
            JButton btn = new JButton(category);
            btn.setBackground(new Color(10, 50, 80));
            btn.setForeground(Color.WHITE);
            sidePanel.add(btn);
        }
        mainFrame.add(sidePanel, BorderLayout.WEST);

        return mainFrame;
    }
    public JFrame prepareBottomPanel() {
        bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(217,  217,217));
        submitButton = new JButton("Submit");
        exitButton = new JButton("Exit");
        bottomPanel.setPreferredSize(new Dimension(800, 50));
        submitButton.setBackground(new Color(3, 60, 91));
        submitButton.setForeground(Color.WHITE);
        exitButton.setBackground(new Color(3, 60, 91));
        // Styling Buttons
        Font buttonFont = new Font("Arial", Font.BOLD, 16);
        submitButton.setFont(buttonFont);
        exitButton.setFont(buttonFont);

        exitButton.setForeground(Color.WHITE);

        bottomPanel.add(submitButton);
        bottomPanel.add(exitButton);
        mainFrame.add(bottomPanel, BorderLayout.SOUTH);
    return mainFrame;
    }

}
