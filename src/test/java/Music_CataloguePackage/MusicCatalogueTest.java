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
}




