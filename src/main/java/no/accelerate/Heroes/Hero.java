package no.accelerate.Heroes;

import java.util.HashSet;

public abstract class Hero {
    private String name;
    protected int level = 1;

    protected HeroAttribute lvlAttributes;
    //protected String equipment; // Vet ikke hvordan denne skal være enda
    HashSet<String> equipment = new HashSet<>();
    //protected List<validWeaponTypeList> validWeaponTypes;
    //protected List<validArmorTypeList> validArmorTypes;

    public Hero(String name, int strength, int dexterity, int intelligence) {
        this.name = name;
        lvlAttributes = new HeroAttribute(strength, dexterity, intelligence);
    }

    public String increaseLevel() {
        level += 1;
        return "Level up! " + name + "are now " + level + "!";
    }



}
