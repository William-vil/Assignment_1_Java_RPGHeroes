package no.accelerate.Heroes;

import no.accelerate.Equipment.ArmorType;
import no.accelerate.Equipment.WeaponType;

import java.util.ArrayList;
import java.util.List;

public class Warrior extends Hero{
    public Warrior(String name) {
        super(name, 5, 2, 1);
        int damageWarrior = 1;
        validWeaponTypes = defineValidWeaponTypes();
        validArmorTypes = defineValidArmorTypes();
    }

    public String increaseLevel() {
        lvlAttributes.attributeIncrease(3,2,1);
        return super.increaseLevel();
    }

    /**
     * Defines allowed weapons for warrior
     */
    public List<WeaponType> defineValidWeaponTypes() {
        List<WeaponType> validWeaponTypes = new ArrayList<>();
        validWeaponTypes.add(WeaponType.SWORD);
        validWeaponTypes.add(WeaponType.AXE);
        validWeaponTypes.add(WeaponType.HAMMER);
        return validWeaponTypes;
    }

    /**
     * Defines allowed armor for warrior
     */
    public List<ArmorType> defineValidArmorTypes() {
        List<ArmorType> validArmorTypes = new ArrayList<>();
        validArmorTypes.add(ArmorType.MAIL);
        validArmorTypes.add(ArmorType.PLATE);
        return validArmorTypes;
    }

}
