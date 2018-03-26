package com.nespresso.sofa.recruitement.tournament.item;

import static com.nespresso.sofa.recruitement.tournament.item.ItemType.AXE;

import com.nespresso.sofa.recruitement.tournament.Blow;

public class Buckler extends Item {

    private int numberOfHits = 0;

    private int numberOfHitsByAxe = 0;

    @Override
    public Blow onDefense(Blow blow) {
        if (blow.getDamage() == 0) {
            return blow;
        }

        numberOfHits++;
        if (blow.isWeapon(AXE) && blocks()) {
            numberOfHitsByAxe++;
        }

        if (isBroken()) {
            return blow;
        }
        if (numberOfHitsByAxe >= 3) {
            breakIt();
        }

        if (blocks()) {
            return blow.zeroDamage();
        }

        return blow;
    }

    private boolean blocks() {
        return numberOfHits % 2 != 0;
    }

    @Override
    public String toString() {
        return "Buckler{" + "numberOfHits=" + numberOfHits + ", numberOfHitsByAxe=" + numberOfHitsByAxe + ", broken=" + isBroken() + '}';
    }

    @Override
    public boolean isWeapon() {
        return false;
    }

    @Override
    public boolean isType(ItemType itemType) {
        return false;
    }
}
