package no.accelerate.Heroes;

import no.accelerate.Equipment.ArmorType;
import no.accelerate.Equipment.WeaponType;

import java.util.*;

public class Mage extends Hero{

    /**
     * Creates mage
     */
    public Mage(String name) {
        super(name, 1, 1, 8);
        int damageMage = 1;
        validWeaponTypes = defineValidWeaponTypes();
        validArmorTypes = defineValidArmorTypes();
    }

    /**
     * Increases mages attributes
     */
    public String increaseLevel() {
        lvlAttributes.attributeIncrease(1,1,5);
        return super.increaseLevel();
    }

    /**
     * Defines allowed weapons for mage
     */
    public List<WeaponType> defineValidWeaponTypes() {
        List<WeaponType> validWeaponTypes = new ArrayList<WeaponType>();
        validWeaponTypes.add(WeaponType.STAFF);
        validWeaponTypes.add(WeaponType.WAND);
        return validWeaponTypes;
    }


    /**
     * Defines allowed armor for mage
     */
    public List<ArmorType> defineValidArmorTypes() {
        List<ArmorType> validArmorTypes = new ArrayList<>();
        validArmorTypes.add(ArmorType.CLOTH);
        return validArmorTypes;
    }

}
