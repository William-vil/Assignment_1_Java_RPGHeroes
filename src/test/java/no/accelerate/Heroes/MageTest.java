package no.accelerate.Heroes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.PrimitiveIterator;

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
    public void shouldStartWithCorrectAttributesMage() {
        // Arrange
        HeroAttribute expected = new HeroAttribute(1, 1, 8);
        // Act
        HeroAttribute actual = mage.getLvlAttributes();
        // Assert
        assertEquals(expected, actual);
    }



    @Test
    public void shouldIncreaseAttributesCorrectlyWhenLvlUpMage() {
        // Arrange
        HeroAttribute expected = new HeroAttribute(1 + 1,1 + 1,8 + 5);
        // Act
        mage.increaseLevel();
        HeroAttribute actual = mage.getLvlAttributes();
        // Assert
        assertEquals(expected, actual);
    }

}