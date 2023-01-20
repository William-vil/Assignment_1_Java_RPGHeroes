package no.accelerate.Heroes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    private Warrior warrior;

    @BeforeEach
    void setUpWarrior() {
        warrior = new Warrior("Megasterk");
    }

    @Test
    public void Warrior_testingIfNameIsCorrect() {
        // Arrange
        String expected = "Megasterk";
        // Act
        String actual = warrior.getName();
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStartWithCorrectAttributesWarrior() {
        // Arrange
        HeroAttribute expected = new HeroAttribute(5, 2, 1);
        // Act
        HeroAttribute actual = warrior.getLvlAttributes();
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseAttributesCorrectlyWhenLvlUpWarrior() {
        // Arrange
        HeroAttribute expected = new HeroAttribute(5 + 3,2 + 2,1 + 1);
        // Act
        warrior.increaseLevel();
        HeroAttribute actual = warrior.getLvlAttributes();
        // Assert
        assertEquals(expected, actual);
    }
}