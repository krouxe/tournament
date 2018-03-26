package com.nespresso.sofa.recruitement.tournament.trait;

import com.nespresso.sofa.recruitement.tournament.Blow;
import com.nespresso.sofa.recruitement.tournament.Fighter;

public class Viscious implements Trait {

    private int numberOfAttacks = 0;

    @Override
    public Blow onAttack(Fighter attacker, Blow blow) {
        if (++numberOfAttacks <= 2) {
            return blow.add(20);
        } else {
            return blow;
        }
    }
}
