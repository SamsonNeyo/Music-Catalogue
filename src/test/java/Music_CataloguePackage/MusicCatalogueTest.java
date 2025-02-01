import static org.junit.jupiter.api.Assertions.*;

import Music_CataloguePackage.MusicCatalogue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.*;
import java.util.List;

class MusicCatalogueTest {
    private MusicCatalogue musicCatalogue;

    @BeforeEach
    void setUp() {
        musicCatalogue = new MusicCatalogue();
    }

    @Test
    void testPrepareLayoutBorder() {
        JFrame frame = musicCatalogue.prepareLayoutBorder();
        assertNotNull(frame, "Frame should not be null");
        assertEquals("Music Catalogue", frame.getTitle(), "Frame title should be correct");
        assertEquals(new Dimension(800, 500), frame.getSize(), "Frame should have correct size");
        assertEquals(BorderLayout.class, frame.getLayout().getClass(), "Frame should use BorderLayout");
    }
    @Test
    void testPrepareHeader() {
        JFrame frame = musicCatalogue.prepareHeader();
        assertNotNull(frame, "Frame should not be null");
        JPanel topPanel = (JPanel) frame.getContentPane().getComponent(0);
        assertNotNull(topPanel, "Top panel should not be null");
        assertEquals(Color.LIGHT_GRAY, topPanel.getBackground(), "Top panel should have the correct background color");
        JLabel titleLabel = (JLabel) topPanel.getComponent(0);
        assertEquals("My Music Catalogue", titleLabel.getText(), "Title label should have correct text");
    }
    @Test
    void testPrepareSidePanel() {
        JFrame frame = musicCatalogue.prepareSidePanel();
        assertNotNull(frame, "Frame should not be null");
        JPanel sidePanel = (JPanel) frame.getContentPane().getComponent(1);
        assertNotNull(sidePanel, "Side panel should not be null");
        assertEquals(new Color(40, 55, 70), sidePanel.getBackground(), "Side panel should have the correct background color");

        Component[] components = sidePanel.getComponents();
        String[] expectedCategories = {"Reggae", "Ballads", "Rap"};
        assertEquals(expectedCategories.length, components.length, "Side panel should contain the correct number of buttons");

        for (int i = 0; i < components.length; i++) {
            assertTrue(components[i] instanceof JButton, "Side panel should contain buttons");
            JButton button = (JButton) components[i];
            assertEquals(expectedCategories[i], button.getText(), "Button should have the correct label");
            assertEquals(Color.LIGHT_GRAY, button.getBackground(), "Buttons should have the correct background color");
            assertEquals(Color.DARK_GRAY, button.getForeground(), "Buttons should have the correct text color");
        }


    }
}
