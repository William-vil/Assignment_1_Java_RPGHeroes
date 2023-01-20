package no.accelerate.Heroes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RogueTest {

    private Rogue rogue;

    @BeforeEach
    void setUpRogue() {
        rogue = new Rogue("Gingibruddah");
    }

    @Test
    void Rogue_testingIfNameIsCorrect() {
        // Arrange
        String expected = "Gingibruddah";
        // Act
        String actual = rogue.getName();
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void defineValidWeaponTypes() {
    }

    @Test
    void defineValidArmorTypes() {
    }
}