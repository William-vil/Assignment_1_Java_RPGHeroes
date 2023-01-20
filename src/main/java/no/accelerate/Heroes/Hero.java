package no.accelerate.Heroes;

import no.accelerate.Equipment.Armor;
import no.accelerate.Equipment.Weapon;  
import no.accelerate.Equipment.InvalidWeaponException;
import no.accelerate.Equipment.InvalidArmorException;
import no.accelerate.Equipment.Item;
import no.accelerate.Equipment.Slot;
import no.accelerate.Equipment.ArmorType;
import no.accelerate.Equipment.WeaponType;
import no.accelerate.Heroes.HeroAttribute;


import java.util.HashMap;

public abstract class Hero {
    private String name;
    protected int level = 1;

    protected HeroAttribute lvlAttributes;
    //protected String equipment; // Vet ikke hvordan denne skal være enda
    private HashMap<Slot, Item> equipment = new HashMap<>();
    protected List<validWeaponTypeList> validWeaponTypes;
    protected List<validArmorTypeList> validArmorTypes;

    public Hero(String name, int strength, int dexterity, int intelligence) {
        this.name = name;
        lvlAttributes = new HeroAttribute(strength, dexterity, intelligence);
        initializeEquipment();
    }
    public String increaseLevel() {
        level += 1;
        return "Level up! " + name + "are now " + level + "!";
    }


    private void initializeEquipment() {
        equipment = new HashMap<>();
        equipment.put(Slot.HEAD, null);
        equipment.put(Slot.BODY, null);
        equipment.put(Slot.LEGS, null);
        equipment.put(Slot.WEAPON, null);
    }

    public String equip(Weapon weapon) throws InvalidWeaponException {
        // Level too high
        if(weapon.getRequiredLevel() > level)
            throw new InvalidWeaponException("Weapon level too high!");
        // Incorrect weapon type
        if(!validWeaponTypes.contains(weapon.getWeaponType()))
            throw new InvalidWeaponException("Wrong weapon type!");
        // Passed all guards
        equipment.put(weapon.getSlot(), weapon);
        return "Weapon equipped!";
    }

    public String equip(Armor armor) throws InvalidArmorException {
        // Level too high
        if(armor.getRequiredLevel() > level)
            throw new InvalidArmorException("Armor level too high!");
        // Incorrect armor type
        if(!validArmorTypes.contains(armor.getArmorType()))
            throw new InvalidArmorException("Wrong armor type!");
        // Passed all guards
        equipment.put(armor.getSlot(), armor);
        return "Armor equipped!";
    }


    // Generated stuff
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public HeroAttribute getLvlAttributes() {
        return lvlAttributes;
    }
}
