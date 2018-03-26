package com.nespresso.sofa.recruitement.tournament.item;

import com.nespresso.sofa.recruitement.tournament.Blow;

public abstract class Item {

    private boolean broken;

    public Blow onDefense(Blow blow) {
        return blow;
    }

    public Blow onAttack(Blow blow) {
        return blow;
    }

    public boolean isBroken() {
        return broken;
    }

    protected void breakIt() {
        this.broken = true;
    }

    public abstract boolean isType(ItemType itemType);

    public abstract boolean isWeapon();

    @Override
    public String toString() {
        return "Item{" + "broken=" + broken + '}';
    }
}
