package com.nespresso.sofa.recruitement.tournament.item;

import java.util.ArrayList;
import java.util.List;

import com.nespresso.sofa.recruitement.tournament.Blow;

public class Equipment {

    private Weapon weapon = Weapon.none();

    private List<Item> items = new ArrayList<>();

    public Blow attack() {
        return onAttack(weapon.blow());
    }

    private Blow onAttack(Blow blow) {
        Blow result = blow;
        for (Item item : items) {
            result = item.onAttack(result);
        }
        return result;
    }

    public Blow onDefense(Blow blow) {
        Blow result = blow;
        for (Item item : items) {
            result = item.onDefense(result);
        }
        return result;
    }

    public void equip(Item item) {
        if (item.isWeapon()) {
            switchWeapon((Weapon) item);
        } else {
            this.items.add(item);
        }
    }

    private void switchWeapon(Weapon weapon) {
        this.items.remove(this.weapon);
        this.weapon = weapon;
        this.items.add(weapon);
    }

    @Override
    public String toString() {
        return "Equipment{" + "items=" + items + '}';
    }
}
