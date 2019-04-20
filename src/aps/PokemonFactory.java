/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;

/**
 *
 * @author Isabela
 */
public class PokemonFactory {
    public static Pokemon createPokemon(String name){
        switch(name){
            case "raichu":
                return new Pokemon(PokemonAndMoveTypes.ELECTRIC, "Raichu", 60, 90, 55, 100);         
            case "heliolisk":
                return new Pokemon(PokemonAndMoveTypes.ELECTRIC, "Heliolisk", 62, 55, 52, 100);                
            case "dartrix":
                return new Pokemon(PokemonAndMoveTypes.FLYING, "Dartrix", 78, 75, 75, 52);               
            case "togekiss":
                return new Pokemon(PokemonAndMoveTypes.FLYING, "Togekiss", 85, 50, 95, 80);                
            case "quilladin":
                return new Pokemon(PokemonAndMoveTypes.GRASS, "Quilladin", 61, 78, 95, 57);                
            case "blastoise":
                return new Pokemon(PokemonAndMoveTypes.WATER, "Blastoise", 79, 83, 100, 78);               
            case "dewott":
                return new Pokemon(PokemonAndMoveTypes.WATER, "Dewott", 75, 75, 60, 60);               
            case "litten":
                return new Pokemon(PokemonAndMoveTypes.FIRE, "Litten", 45, 65, 40, 70);               
            case "charizard":
                return new Pokemon(PokemonAndMoveTypes.FIRE, "Charizard", 78, 84, 78, 100);
                
        }
        return null;
    }
}