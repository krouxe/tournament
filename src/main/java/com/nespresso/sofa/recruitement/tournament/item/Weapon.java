package com.nespresso.sofa.recruitement.tournament.item;

import com.nespresso.sofa.recruitement.tournament.Blow;

public abstract class Weapon extends Item {

    public abstract int getDamage();

    public Blow blow() {
        return new Blow(this);
    }

    @Override
    public boolean isWeapon() {
        return true;
    }

    public static Weapon none() {
        return new Weapon() {
            @Override
            public boolean isType(ItemType itemType) {
                return false;
            }

            @Override
            public int getDamage() {
                return 0;
            }
        };
    }
}
