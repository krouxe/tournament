package com.nespresso.sofa.recruitement.tournament;

import com.nespresso.sofa.recruitement.tournament.item.GreatSword;

public class Highlander extends Fighter {

    public Highlander() {
        super(150);
        equip(new GreatSword());
    }

    public Highlander(String trait) {
        this();
        setTrait(trait);
    }

}
