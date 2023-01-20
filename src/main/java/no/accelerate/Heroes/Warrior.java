package no.accelerate.Heroes;

public class Warrior extends Hero{
    public Warrior(String name) {
        super(name, 5, 2, 1);
        int damageWarrior = 1;
    }

    public String increaseLevel() {
        lvlAttributes.attributeIncrease(3,2,1);
        return super.increaseLevel();
    }

}
