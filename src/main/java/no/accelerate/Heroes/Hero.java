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
import java.util.List;

public abstract class Hero {
    private final String name;
    protected int level = 1;

    protected HeroAttribute lvlAttributes;

    private HashMap<Slot, Item> equipment = new HashMap<>();

    protected List<WeaponType> validWeaponTypes;
    protected List<ArmorType> validArmorTypes;




    public Hero(String name, int strength, int dexterity, int intelligence) {
        this.name = name;
        lvlAttributes = new HeroAttribute(strength, dexterity, intelligence);
        newEquipment();
    }

    /**
     * @return
     * A method used to level up a character
     */
    public String increaseLevel() {
        level += 1;
        return "Level up! " + name + "are now " + level + "!";
    }


    /**
     * Method for a hero to have empty slots when created
     */
    private void newEquipment() {
        equipment = new HashMap<>();
        equipment.put(Slot.HEAD, null);
        equipment.put(Slot.BODY, null);
        equipment.put(Slot.LEGS, null);
        equipment.put(Slot.WEAPON, null);
    }


    // Equipping weapon
    public String Equip(Weapon weapon) throws InvalidWeaponException {
        // If statement to check if level is too high
        if(weapon.getRequiredLevel() > level)
            throw new InvalidWeaponException("Ilvl too high bro");
        // If statement to check weapon type
        if(!validWeaponTypes.contains(weapon.getWeaponType()))
            throw new InvalidWeaponException("You can not use this weapon type");

        equipment.put(weapon.getSlot(), weapon);
        return "Equipped new weapon";
    }

    // Equipping armor
    public String Equip(Armor armor) throws InvalidArmorException {
        // If statement to check if level is too high
        if(armor.getRequiredLevel() > level)
            throw new InvalidArmorException("Ilvl is too high bro");
        // If statement to check armor type
        if(!validArmorTypes.contains(armor.getArmorType()))
            throw new InvalidArmorException("This is the wrong armor");

        equipment.put(armor.getSlot(), armor);
        return "Equipped new armor";
    }

    public void Damage() {

    }

    public void totalAttributes() {

    }

    public void Display() {

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
