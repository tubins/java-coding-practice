package com.tubz.chainofresponisibility.methodchain;

public class IncreaseDefenceModifier extends CreatureModifier{
    public IncreaseDefenceModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("Doubling " + creature.name + "'s defence.");
        creature.defence += 3;
        super.handle();
    }
}
