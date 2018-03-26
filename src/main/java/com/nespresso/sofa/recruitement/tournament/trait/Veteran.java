package com.nespresso.sofa.recruitement.tournament.trait;

import com.nespresso.sofa.recruitement.tournament.Blow;
import com.nespresso.sofa.recruitement.tournament.Fighter;

public class Veteran implements Trait {

    @Override
    public Blow onAttack(Fighter attacker, Blow blow) {
        if (attacker.lifeUnder(0.3)) {
            return blow.multiply(2);
        } else {
            return blow;
        }
    }
}
