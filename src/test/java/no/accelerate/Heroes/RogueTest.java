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
    public void shouldStartWithCorrectAttributesRogue() {
        // Arrange
        HeroAttribute expected = new HeroAttribute(2, 6, 1);
        // Act
        HeroAttribute actual = rogue.getLvlAttributes();
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseAttributesCorrectlyWhenLvlUpRogue() {
        // Arrange
        HeroAttribute expected = new HeroAttribute(2 + 1,6 + 4,1 + 1);
        // Act
        rogue.increaseLevel();
        HeroAttribute actual = rogue.getLvlAttributes();
        // Assert
        assertEquals(expected, actual);
    }
}