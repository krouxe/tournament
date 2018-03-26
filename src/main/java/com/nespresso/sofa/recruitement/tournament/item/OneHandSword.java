package com.nespresso.sofa.recruitement.tournament.item;

import static com.nespresso.sofa.recruitement.tournament.item.ItemType.SWORD;

public class OneHandSword extends Weapon {

    @Override
    public int getDamage() {
        return 5;
    }

    @Override
    public boolean isType(ItemType itemType) {
        return itemType == SWORD;
    }

    @Override
    public String toString() {
        return "OneHandSword{}";
    }
}
