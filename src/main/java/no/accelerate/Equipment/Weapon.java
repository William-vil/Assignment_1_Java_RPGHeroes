package no.accelerate.Equipment;

import no.accelerate.Equipment.WeaponType;
import no.accelerate.Equipment.Slot;

/**
 * A class for weapons to be put on heroes.
 */
public class Weapon extends Item {
    private final double baseDamage;
    private final double weaponDamage;
    private final WeaponType weaponType;

    /**
     * Constructor for the weapon class
     */
    public Weapon(String name, int requiredLevel, WeaponType weaponType, double baseDamage, double weaponDamage) {
        super(name, requiredLevel, Slot.WEAPON);
        this.baseDamage = baseDamage;
        this.weaponDamage = weaponDamage;
        this.weaponType = weaponType;
    }

    public double getHeroDamage() {
        return baseDamage * (1 * weaponDamage/100);
    }

    // Generated stuff
    public WeaponType getWeaponType() {
        return weaponType;
    }

}

