package no.accelerate.Heroes;

public class Ranger extends Hero{
    public Ranger(String name){
        super(name, 1, 7, 1);
    }

    public String increaseLevel() {
        lvlAttributes.attributeIncrease(1,5,1);
        return super.increaseLevel();
    }
}
