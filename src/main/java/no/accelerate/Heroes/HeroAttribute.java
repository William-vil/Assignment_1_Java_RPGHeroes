package no.accelerate.Heroes;

import java.util.Objects;

public class HeroAttribute {

    private int strength;
    private int dexterity;
    private int intelligence;

    public HeroAttribute(int strength, int dexterity, int intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public void attributeIncrease(int strength, int dexterity, int intelligence) {
        this.strength++;
        this.dexterity++;
        this.intelligence++;
    }
}
