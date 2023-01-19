package no.accelerate.Heroes;

public class Mage extends Hero{
    public Mage(String name) {
        super(name, 1, 1, 8);
    }

    public String increaseLevel() {
        lvlAttributes.attributeIncrease(1,1,5);
        return super.increaseLevel();
    }
}
