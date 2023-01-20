package no.accelerate.Heroes;

public class Rogue extends Hero{
    public Rogue(String name) {
        super(name, 2, 6, 1);
        int damageRogue = 1;
    }

    public String increaseLevel() {
        lvlAttributes.attributeIncrease(1,4,1);
        return super.increaseLevel();
    }

}
