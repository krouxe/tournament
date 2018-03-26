package com.nespresso.sofa.recruitement.tournament;

import com.nespresso.sofa.recruitement.tournament.item.ItemType;
import com.nespresso.sofa.recruitement.tournament.item.Weapon;

public class Blow {

    private int damage;

    private Weapon weapon;

    public Blow(Weapon weapon) {
        this(weapon, weapon.getDamage());
    }

    private Blow(Weapon weapon, int damage) {
        if (damage < 0) {
            throw new IllegalArgumentException("damage must be a positive integer");
        }
        this.weapon = weapon;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public Blow zeroDamage() {
        return new Blow(weapon, 0);
    }

    public Blow multiply(double coef) {
        if (coef < 0) {
            throw new IllegalArgumentException("coef must be a positive double");
        }
        int newDamage = (int) (getDamage() * coef);
        return new Blow(weapon, newDamage);
    }

    public Blow add(int damage) {
        return new Blow(weapon, Math.max(0, this.damage + damage));
    }

    public boolean isWeapon(ItemType itemType) {
        return weapon.isType(itemType);
    }
}
