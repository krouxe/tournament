package com.nespresso.sofa.recruitement.tournament.item;

import static com.nespresso.sofa.recruitement.tournament.item.ItemType.AXE;

public class OneHandAxe extends Weapon {

    @Override
    public int getDamage() {
        return 6;
    }

    @Override
    public boolean isType(ItemType itemType) {
        return itemType == AXE;
    }

    @Override
    public String toString() {
        return "OneHandAxe{}";
    }

}
