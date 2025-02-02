package Music_CataloguePackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MusicCatalogue {
    public JFrame mainFrame;
    private JPanel sidePanel, bottomPanel, centerPanel;
    private String[] categories = {"Reggae", "Ballads", "Rap"};
    private JButton submitButton, exitButton;
    private JComboBox<String> genreDropdown;
    private JCheckBox availableCheckBox;
    private JTextField artistField, studioField;

    public MusicCatalogue() {
        this.prepareLayoutBorder();
        this.prepareHeader();
        this.prepareSidePanel();
        this.prepareBottomPanel();
        this.prepareCenterPanel(); // Make sure this is called before setting visibility

        // Ensure all components are updated
        mainFrame.revalidate();
        mainFrame.repaint();

        // Move visibility setting to the end
        mainFrame.setVisible(true);
    }

    public JFrame prepareLayoutBorder() {
        mainFrame = new JFrame("Music Catalogue");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(600, 400);
        mainFrame.setLayout(new BorderLayout());

        return mainFrame;
    }

    public JFrame prepareHeader() {
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(217, 217, 217));
        topPanel.setPreferredSize(new Dimension(600, 50));
        JLabel titleLabel = new JLabel("My Music Catalogue");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        topPanel.add(titleLabel);
        mainFrame.add(topPanel, BorderLayout.NORTH);

        return mainFrame;
    }

    public JFrame prepareSidePanel() {
        sidePanel = new JPanel(new GridLayout(3, 1, 10, 10));
        sidePanel.setBackground(new Color(255, 255, 233));
        sidePanel.setPreferredSize(new Dimension(100, 5));
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
        bottomPanel.setBackground(new Color(217, 217, 217));
        submitButton = new JButton("Submit");
        exitButton = new JButton("Exit");
        bottomPanel.setPreferredSize(new Dimension(800, 55));
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

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String artistName = artistField.getText();
                String studioName = studioField.getText();
                String genre = (String) genreDropdown.getSelectedItem();
                boolean isAvailable = availableCheckBox.isSelected();

                System.out.println("Artist Name: " + artistName);
                System.out.println("Recording Studio: " + studioName);
                System.out.println("Category: " + genre);
                System.out.println("Available: " + isAvailable);
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        return mainFrame;
    }

    public void prepareCenterPanel() {
        centerPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        centerPanel.setBackground(new Color(10, 50, 80)); // Darker Blue

        // Explicitly set preferred size to ensure visibility
        centerPanel.setPreferredSize(new Dimension(400, 200));

        // Labels
        JLabel artistLabel = new JLabel("Artist Name:");
        JLabel studioLabel = new JLabel("Recording Studio:");
        JLabel genreLabel = new JLabel("Category:");
        JLabel availableLabel = new JLabel("Available:");

        // Inputs
        artistField = new JTextField();
        studioField = new JTextField();
        genreDropdown = new JComboBox<>(categories);
        availableCheckBox = new JCheckBox();

        // Styling Labels
        Font labelFont = new Font("Arial", Font.BOLD, 14);
        Color labelColor = Color.WHITE;
        artistLabel.setFont(labelFont);
        artistLabel.setForeground(labelColor);
        studioLabel.setFont(labelFont);
        studioLabel.setForeground(labelColor);
        genreLabel.setFont(labelFont);
        genreLabel.setForeground(labelColor);
        availableLabel.setFont(labelFont);
        availableLabel.setForeground(labelColor);

        // Add to Center Panel
        centerPanel.add(artistLabel);
        centerPanel.add(artistField);
        centerPanel.add(studioLabel);
        centerPanel.add(studioField);
        centerPanel.add(genreLabel);
        centerPanel.add(genreDropdown);
        centerPanel.add(availableLabel);
        centerPanel.add(availableCheckBox);

        mainFrame.add(centerPanel, BorderLayout.CENTER);
    }

}
