package no.accelerate.Heroes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    private Mage mage;
    @BeforeEach
    void setUpMage() {
        mage = new Mage("Gandalf");
    }


    @Test
    public void Mage_testingIfNameIsCorrect() {
        // Arrange
        String expected = "Gandalf";
        // Act
        String actual = mage.getName();
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void increaseLevelMage() {
    }
}