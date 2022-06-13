package com.tubz.proxy.propertyProxy;

public class Creature {
    private Property<Integer> agility = new Property<>(10);

    public void setAgility(int agility) {
        this.agility.setValue(agility);
    }

    public Property<Integer> getAgility() {
        return agility;
    }
}
