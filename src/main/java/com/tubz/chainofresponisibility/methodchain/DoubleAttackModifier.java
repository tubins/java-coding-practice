package com.tubz.chainofresponisibility.methodchain;

public class DoubleAttackModifier extends CreatureModifier{
    public DoubleAttackModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("Doubling " + creature.name + "'s attack." + creature.attack);
        creature.attack *= 2;
        super.handle();
    }
}
