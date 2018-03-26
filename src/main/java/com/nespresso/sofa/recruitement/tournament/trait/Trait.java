package com.nespresso.sofa.recruitement.tournament.trait;

import com.nespresso.sofa.recruitement.tournament.Blow;
import com.nespresso.sofa.recruitement.tournament.Fighter;

public interface Trait {

    default Blow onAttack(Fighter attacker, Blow blow) {
        return blow;
    }

    static Trait none() {
        return new Trait() {
        };
    }
}
