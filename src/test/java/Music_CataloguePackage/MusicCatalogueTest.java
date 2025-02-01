package Music_CataloguePackage;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class MusicCatalogueTest {
    private MusicCatalogue musicCatalogue;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        musicCatalogue = new MusicCatalogue();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }


    @org.junit.jupiter.api.Test
    void prepareLayoutBorder() {
        MusicCatalogue musicCatalogue = new MusicCatalogue();
        JFrame frame = musicCatalogue.prepareLayoutBorder();
        assertNotNull(frame);
        assertEquals("Music Catalogue", frame.getTitle());
        assertEquals(800, frame.getWidth());
        assertEquals(600, frame.getHeight());
        assertTrue(frame.isVisible());


    }



    @Test

    void prepareHeader() {
        JFrame frame = musicCatalogue.prepareHeader();
        assertNotNull(frame, "Frame should not be null");
        JPanel topPanel = (JPanel) frame.getContentPane().getComponent(0);
        assertNotNull(topPanel, "Top panel should not be null");
        assertEquals(new Color(217, 217, 217), topPanel.getBackground(), "Top panel should have the correct background color");
        JLabel titleLabel = (JLabel) topPanel.getComponent(0);
        assertEquals("My Music Catalogue", titleLabel.getText(), "Title label should have correct text");
    }


    @Test
    void prepareSidePanel() {
        JFrame frame = musicCatalogue.prepareSidePanel();
        assertNotNull(frame, "Frame should not be null");
        JPanel sidePanel = (JPanel) frame.getContentPane().getComponent(1);
        assertNotNull(sidePanel, "Side panel should not be null");
        assertEquals(new Color(255, 255, 233), sidePanel.getBackground(), "Side panel should have the correct background color");

        Component[] components = sidePanel.getComponents();
        for (Component component : components) {
            assertTrue(component instanceof JButton, "Side panel should contain buttons");
            JButton button = (JButton) component;
            assertEquals(new Color(10, 50, 80), button.getBackground(), "Buttons should have the correct background color");
            assertEquals(Color.WHITE, button.getForeground(), "Buttons should have the correct text color");
        }
    }

    @Test
    void prepareBottomPanel() {
        JFrame frame = musicCatalogue.prepareBottomPanel();
        assertNotNull(frame, "Frame should not be null");
        JPanel bottomPanel = (JPanel) frame.getContentPane().getComponent(2);
        assertNotNull(bottomPanel, "Bottom panel should not be null");
        assertEquals(new Color(217, 217, 217), bottomPanel.getBackground(), "Bottom panel should have the correct background color");
        assertEquals(new Dimension(800, 55), bottomPanel.getPreferredSize(), "Bottom panel should have the correct size");

        Component[] components = bottomPanel.getComponents();
        assertEquals(2, components.length, "Bottom panel should contain two buttons");

        JButton submitButton = (JButton) components[0];
        JButton exitButton = (JButton) components[1];

        assertEquals("Submit", submitButton.getText(), "Submit button should have correct label");
        assertEquals(new Color(3, 60, 91), submitButton.getBackground(), "Submit button should have correct background color");
        assertEquals(Color.WHITE, submitButton.getForeground(), "Submit button should have correct text color");

        assertEquals("Exit", exitButton.getText(), "Exit button should have correct label");
        assertEquals(new Color(3, 60, 91), exitButton.getBackground(), "Exit button should have correct background color");
        assertEquals(Color.WHITE, exitButton.getForeground(), "Exit button should have correct text color");
    }
}




