package no.accelerate.Equipment;

public abstract class Item {
    private final String name;
    protected int requiredLevel;
    protected String slot;

    public Item(String name, int requiredLevel, String slot) {
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.slot = slot;
    }


    public String getName() {
        return name;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public String getSlot() {
        return slot;
    }
}
