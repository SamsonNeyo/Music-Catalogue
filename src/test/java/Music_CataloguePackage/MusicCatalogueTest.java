package Music_CataloguePackage;

import javax.swing.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class MusicCatalogueTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
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
        assertEquals(500, frame.getHeight());
        assertTrue(frame.isVisible());


    }

    
}