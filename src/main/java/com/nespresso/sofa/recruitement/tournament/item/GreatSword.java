package com.nespresso.sofa.recruitement.tournament.item;

import com.nespresso.sofa.recruitement.tournament.Blow;

public class GreatSword extends Weapon {

    private int blowCount = 0;

    @Override
    public int getDamage() {
        return 12;
    }

    @Override
    public Blow onAttack(Blow blow) {
        if (++blowCount % 3 == 0) {
            return blow.zeroDamage();
        }
        return blow;
    }

    @Override
    public boolean isType(ItemType itemType) {
        return itemType == ItemType.SWORD;
    }
}
