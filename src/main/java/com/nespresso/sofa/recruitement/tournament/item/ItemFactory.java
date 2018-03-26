package com.nespresso.sofa.recruitement.tournament.item;

public class ItemFactory {

    public static Item newItem(String itemName) {
        switch (itemName.toLowerCase()) {
            case "buckler" :
                return new Buckler();
            case "armor" :
                return new Armor();
            case "axe" :
                return new OneHandAxe();
            default :
                throw new IllegalArgumentException("Unknown item: " + itemName);
        }

    }
}
