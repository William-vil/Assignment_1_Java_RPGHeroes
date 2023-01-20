package no.accelerate.Heroes;

import no.accelerate.Equipment.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTestEquip {

    private Mage hero;

    @BeforeEach
    public void setUpMage() {
        hero = new Mage("Gingimage");
    }

    @Test
    public void MageShouldReturnCorrectEquipMessage() {
        // Arrange
        Weapon staffWeapon = new Weapon("Firebolt Staff",1,
                WeaponType.STAFF,1,1);
        String expected = "Equipped new weapon";
        // Act
        String actual = assertDoesNotThrow(() -> hero.Equip(staffWeapon));
        // Assert
        assertEquals(expected,actual);
    }



    @Test
    public void MageThrowInvalidWeaponExceptionForEquipment() {
        // Arrange
        Weapon hammerWeapon = new Weapon("Hammer of Doom",1,
                WeaponType.HAMMER,1,1);
        String expected = "You can not use this weapon type";
        // Act
        Exception exception = assertThrows(InvalidWeaponException.class, () -> hero.Equip(hammerWeapon));
        String actual = exception.getMessage();
        // Assert
        assertEquals(expected,actual);
    }


    @Test
    public void MageThrowInvalidWeaponExceptionForTooHighLevel() {
        // Arrange
        Weapon staffWeapon = new Weapon("Firebolt Staff",2,
                WeaponType.STAFF,1,1);
        String expected = "Ilvl too high bro";
        // Act
        Exception exception = assertThrows(InvalidWeaponException.class, () -> hero.Equip(staffWeapon));
        String actual = exception.getMessage();
        // Assert
        assertEquals(expected,actual);
    }

    @Test
    public void MageShouldReturnCorrectEquipMessageForArmor() {
        // Arrange
        Armor robeArmor = new Armor("Heigans Putrid Vestment", Slot.BODY,
                1, ArmorType.CLOTH,1,1,1);
        String expected = "Equipped new armor";
        // Act
        String actual = assertDoesNotThrow(() -> hero.Equip(robeArmor));
        // Assert
        assertEquals(expected,actual);
    }

    @Test
    public void MageShouldReturnInvalidEquipMessageForArmor() {
        // Arrange
        Armor mailArmor = new Armor("Some mail armor", Slot.BODY,
                1, ArmorType.MAIL,1,1,1);
        String expected = "This is the wrong armor";
        // Act
        Exception exception = assertThrows(InvalidArmorException.class, () -> hero.Equip(mailArmor));
        String actual = exception.getMessage();
        // Assert
        assertEquals(expected,actual);
    }

    @Test
    public void MageShouldReturnInvalidEquipLevelMessageForArmor() {
        // Arrange
        Armor robeArmor = new Armor("Heigans Putrid Vestment", Slot.BODY,
                2, ArmorType.CLOTH,1,1,1);
        String expected = "Ilvl is too high bro";
        // Act
        Exception exception = assertThrows(InvalidArmorException.class, () -> hero.Equip(robeArmor));
        String actual = exception.getMessage();
        // Assert
        assertEquals(expected,actual);
    }



}