package aps;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isabela
 */
public class MoveFactory {
    public static Move createMove(String name){
       switch(name){
            case "leafStorm":
                return new Move("Leaf Storm", 30, PokemonAndMoveTypes.GRASS, 7);
            case "magmaStorm": 
                return new Move("Magma Storm", 30, PokemonAndMoveTypes.FIRE, 9);
            case "waterfall": 
                return new Move("Waterfall", 20, PokemonAndMoveTypes.WATER, 9);
            case "shockWave":
                return new Move("Shock Wave", 35, PokemonAndMoveTypes.ELECTRIC, 5);
            case "skyAttack": 
                return new Move("Sky Attack", 30, PokemonAndMoveTypes.FLYING, 7);
       } 
        
       return null;
    }
}
