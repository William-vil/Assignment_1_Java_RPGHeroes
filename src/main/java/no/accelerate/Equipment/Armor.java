package no.accelerate.Equipment;

import no.accelerate.Equipment.ArmorType;
import no.accelerate.Heroes.HeroAttribute;
import no.accelerate.Equipment.Slot;

public class Armor extends Item {
    private final HeroAttribute bonusAttributes;
    private final ArmorType armorType;

    public Armor(String name, Slot slot, int requiredLevel, ArmorType armorType, int bonusStrength, int bonusDexterity, int bonusIntelligence) {
        super(name, slot, requiredLevel);
        this.armorType = armorType;
        bonusAttributes = new HeroAttribute(bonusStrength, bonusDexterity, bonusIntelligence);
    }


    public HeroAttribute getBonusAttributes() {
        return bonusAttributes;
    }

    public ArmorType getArmorType() {
        return armorType;
    }
}

