package com.nespresso.sofa.recruitement.tournament;

import com.nespresso.sofa.recruitement.tournament.item.OneHandSword;

public class Swordsman extends Fighter {

    public Swordsman() {
        super(100);
        equip(new OneHandSword());
    }

    public Swordsman(String trait) {
        this();
        setTrait(trait);
    }
}
