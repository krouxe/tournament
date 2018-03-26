package com.nespresso.sofa.recruitement.tournament;

import static java.lang.Math.max;

import com.nespresso.sofa.recruitement.tournament.item.Equipment;
import com.nespresso.sofa.recruitement.tournament.item.Item;
import com.nespresso.sofa.recruitement.tournament.item.ItemFactory;
import com.nespresso.sofa.recruitement.tournament.trait.Trait;
import com.nespresso.sofa.recruitement.tournament.trait.TraitFactory;

public class Fighter {

    private final int hitPoints;

    private int currentHitPoints;

    private Trait trait = Trait.none();

    private final Equipment equipment = new Equipment();

    public Fighter(int hitPoints) {
        this.hitPoints = hitPoints;
        this.currentHitPoints = hitPoints;
    }

    public void engage(Fighter fighter) {
        attack(fighter);
    }

    private void attack(Fighter fighter) {
        if (isAlive()) {
            Blow blow = trait.onAttack(this, equipment.attack());
            fighter.defend(this, blow);
        }
    }

    private void defend(Fighter fighter, Blow blow) {
        Blow finalBlow = equipment.onDefense(blow);
        this.currentHitPoints = max(0, currentHitPoints - finalBlow.getDamage());
        this.attack(fighter);
    }

    private boolean isAlive() {
        return this.currentHitPoints > 0;
    }

    protected void setTrait(String trait) {
        this.trait = TraitFactory.newTrait(trait);
    }

    public int hitPoints() {
        return this.currentHitPoints;
    }

    public <T extends Fighter> T equip(String itemName) {
        Item item = ItemFactory.newItem(itemName);
        return equip(item);
    }

    public <T extends Fighter> T equip(Item item) {
        this.equipment.equip(item);
        return (T) this;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{ hitPoints=" + currentHitPoints + "/" + hitPoints + ", equipment=" + equipment + '}';
    }

    public boolean lifeUnder(double ratio) {
        return (1.0 * currentHitPoints) / hitPoints <= ratio;
    }
}
