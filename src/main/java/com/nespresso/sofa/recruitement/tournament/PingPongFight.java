package com.nespresso.sofa.recruitement.tournament;

public class PingPongFight {

    private Fighter first;

    private Fighter second;

    public PingPongFight(Fighter first, Fighter second) {
        if (first == null || second == null) {
            throw new NullPointerException();
        }
        this.first = first;
        this.second = second;
    }

    public void resolve() {
        while (first.isAlive() && second.isAlive()) {
            Blow blow = first.attack();
            second.defend(blow);
            switchFighters();
        }
    }

    private void switchFighters() {
        Fighter firstBack = this.first;
        first = second;
        second = firstBack;
    }
}
