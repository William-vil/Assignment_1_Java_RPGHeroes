package no.accelerate.Heroes;

import no.accelerate.Equipment.ArmorType;
import no.accelerate.Equipment.WeaponType;

import java.util.ArrayList;
import java.util.List;

public class Rogue extends Hero{

    /**
     * Creates rogue
     */
    public Rogue(String name) {
        super(name, 2, 6, 1);
        int damageRogue = 1;
        validWeaponTypes = defineValidWeaponTypes();
        validArmorTypes = defineValidArmorTypes();
    }

    /**
     * Increases rogues attributes
     */
    public String increaseLevel() {
        lvlAttributes.attributeIncrease(1,4,1);
        return super.increaseLevel();
    }

    /**
     * Defines allowed weapons for rogue
     */
    public List<WeaponType> defineValidWeaponTypes() {
        List<WeaponType> validWeaponTypes = new ArrayList<WeaponType>();
        validWeaponTypes.add(WeaponType.DAGGER);
        validWeaponTypes.add(WeaponType.SWORD);
        return validWeaponTypes;
    }

    /**
     * Defines allowed armor for rogue
     */
    public List<ArmorType> defineValidArmorTypes() {
        List<ArmorType> validArmorTypes = new ArrayList<>();
        validArmorTypes.add(ArmorType.LEATHER);
        validArmorTypes.add(ArmorType.MAIL);
        return validArmorTypes;
    }

}
