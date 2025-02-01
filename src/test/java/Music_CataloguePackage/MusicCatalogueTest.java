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


    
}
