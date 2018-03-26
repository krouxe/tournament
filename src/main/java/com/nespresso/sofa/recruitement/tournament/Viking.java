package com.nespresso.sofa.recruitement.tournament;

import com.nespresso.sofa.recruitement.tournament.item.OneHandAxe;

public class Viking extends Fighter {

    public Viking() {
        super(120);
        equip(new OneHandAxe());
    }
}
