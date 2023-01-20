package no.accelerate.Equipment;

import no.accelerate.Equipment.ArmorType;
import no.accelerate.Heroes.HeroAttribute;
import no.accelerate.Equipment.Slot;

/**
 * A class for armor to be put on heroes.
 */
public class Armor extends Item {
    private final HeroAttribute armorAttributes;
    private final ArmorType armorType;


    /**
     * Constructor for the armor class
     */
    public Armor(String name, Slot slot, int requiredLevel, ArmorType armorType, int bonusStrength, int bonusDexterity, int bonusIntelligence) {
        super(name, requiredLevel, slot);
        this.armorType = armorType;
        armorAttributes = new HeroAttribute(bonusStrength, bonusDexterity, bonusIntelligence);
    }

    // Generated stuff
    public HeroAttribute getArmorAttributes() {
        return armorAttributes;
    }

    public ArmorType getArmorType() {
        return armorType;
    }
}

