package com.tubz.chainofresponisibility.methodchain;

public class Creature {
     public String name;
    public int attack;
     public int defence;

    public Creature(String name, int attack, int defence) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", defence=" + defence +
                '}';
    }
}
