package no.accelerate.Heroes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangerTest {

    private Ranger ranger;

    @BeforeEach
    public void setUpRanger() {
        ranger = new Ranger("RangerDanger");
    }

    @Test
    public void Ranger_testingIfNameIsCorrect() {
        // Arrange
        String expected = "RangerDanger";
        // Act
        String actual = ranger.getName();
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStartWithCorrectAttributesRanger() {
        // Arrange
        HeroAttribute expected = new HeroAttribute(1, 7, 1);
        // Act
        HeroAttribute actual = ranger.getLvlAttributes();
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseAttributesCorrectlyWhenLvlUpRanger() {
        // Arrange
        HeroAttribute expected = new HeroAttribute(1 + 1,7 + 5,1 + 1);
        // Act
        ranger.increaseLevel();
        HeroAttribute actual = ranger.getLvlAttributes();
        // Assert
        assertEquals(expected, actual);
    }
}