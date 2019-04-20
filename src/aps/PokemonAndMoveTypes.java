/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;

/**
 *
 * @author lab801
 */
public enum PokemonAndMoveTypes {
    ELECTRIC(5), FLYING(4), GRASS(3), WATER(2), FIRE(1);
    
    private final int value;
    private PokemonAndMoveTypes(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
