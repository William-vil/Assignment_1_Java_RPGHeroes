package no.accelerate.Heroes;

import java.util.Objects;

/**
 * Attribute class for heroes. Her I get the attributes needed for
 * the different heroes to level up with the correct stats.
 */
public class HeroAttribute {

    private int strength = 0;
    private int dexterity = 0;
    private int intelligence = 0;


    /**
     * Constructor for the HeroAttribute class
     */
    public HeroAttribute(int strength, int dexterity, int intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    /**
     * Increases the heroes attributes
     */
    public void attributeIncrease(int strength, int dexterity, int intelligence) {
        this.strength += strength;
        this.dexterity += dexterity;
        this.intelligence += intelligence;
    }


    // Generated stuff
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HeroAttribute that)) return false;
        return strength == that.strength && dexterity == that.dexterity && intelligence == that.intelligence;
    }

    @Override
    public int hashCode() {
        return Objects.hash(strength, dexterity, intelligence);
    }
}
