package no.accelerate.Heroes;

import no.accelerate.Equipment.ArmorType;
import no.accelerate.Equipment.WeaponType;

import java.util.ArrayList;
import java.util.List;

public class Ranger extends Hero{

    /**
     * Creates ranger
     */
    public Ranger(String name){
        super(name, 1, 7, 1);
        int damageRanger = 1;
        validWeaponTypes = defineValidWeaponTypes();
        validArmorTypes = defineValidArmorTypes();
    }

    /**
     * Increases ranger attributes
     */
    public String increaseLevel() {
        lvlAttributes.attributeIncrease(1,5,1);
        return super.increaseLevel();
    }

    /**
     * Defines allowed weapons for ranger
     */
    public List<WeaponType> defineValidWeaponTypes() {
        List<WeaponType> validWeaponTypes = new ArrayList<WeaponType>();
        validWeaponTypes.add(WeaponType.BOW);
        return validWeaponTypes;
    }

    /**
     * Defines allowed armor for ranger
     */
    public List<ArmorType> defineValidArmorTypes() {
        List<ArmorType> validArmorTypes = new ArrayList<>();
        validArmorTypes.add(ArmorType.LEATHER);
        validArmorTypes.add(ArmorType.MAIL);
        return validArmorTypes;
    }

}
