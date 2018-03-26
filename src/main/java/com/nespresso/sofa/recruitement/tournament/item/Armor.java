package com.nespresso.sofa.recruitement.tournament.item;

import com.nespresso.sofa.recruitement.tournament.Blow;

public class Armor extends Item {

    @Override
    public Blow onDefense(Blow blow) {
        return blow.add(-3);
    }

    @Override
    public Blow onAttack(Blow blow) {
        return blow.add(-1);
    }

    @Override
    public boolean isType(ItemType itemType) {
        return false;
    }

    @Override
    public boolean isWeapon() {
        return false;
    }
}
