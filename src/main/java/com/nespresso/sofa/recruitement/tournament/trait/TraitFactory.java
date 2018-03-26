package com.nespresso.sofa.recruitement.tournament.trait;

public class TraitFactory {

    public static Trait newTrait(String traitName) {
        switch (traitName.toLowerCase()) {
            case "vicious" :
                return new Viscious();
            case "veteran" :
                return new Veteran();
            default :
                throw new IllegalArgumentException("Invalid trait name: " + traitName);
        }
    }
}
