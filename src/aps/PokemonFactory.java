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
    public static Pokemon createPokemon(String name, Move[] moves){
        switch(name){
            case "raichu":
                Move[] raichuMoves = {moves[0],moves[1],moves[2],moves[3]};
                return new Pokemon(PokemonAndMoveTypes.ELECTRIC, "Raichu", 60, 90, 55, 100, raichuMoves);         
            case "heliolisk":
                Move[] helioliskMoves = {moves[1],moves[2],moves[3],moves[4]};
                return new Pokemon(PokemonAndMoveTypes.ELECTRIC, "Heliolisk", 62, 55, 52, 100, helioliskMoves);                
            case "dartrix":
                Move[] dartrixMoves = {moves[2],moves[3],moves[4],moves[1]};
                return new Pokemon(PokemonAndMoveTypes.FLYING, "Dartrix", 78, 75, 75, 52, dartrixMoves);               
            case "togekiss":
                Move[] togekissMoves = {moves[0],moves[1],moves[2],moves[3]};
                return new Pokemon(PokemonAndMoveTypes.FLYING, "Togekiss", 85, 50, 95, 80, togekissMoves);                
            case "quilladin":
                Move[] quilladinMoves = {moves[0],moves[1],moves[2],moves[3]};
                return new Pokemon(PokemonAndMoveTypes.GRASS, "Quilladin", 61, 78, 95, 57, quilladinMoves);                
            case "blastoise":
                Move[] blastoiseMoves = {moves[0],moves[1],moves[2],moves[3]};
                return new Pokemon(PokemonAndMoveTypes.WATER, "Blastoise", 79, 83, 100, 78, blastoiseMoves);               
            case "dewott":
                Move[] dewottMoves = {moves[0],moves[1],moves[2],moves[3]};
                return new Pokemon(PokemonAndMoveTypes.WATER, "Dewott", 75, 75, 60, 60, dewottMoves);               
            case "litten":
                Move[] littenMoves = {moves[0],moves[1],moves[2],moves[3]};
                return new Pokemon(PokemonAndMoveTypes.FIRE, "Litten", 45, 65, 40, 70, littenMoves);               
            case "charizard":
                Move[] charizardMoves = {moves[0],moves[1],moves[2],moves[3]};
                return new Pokemon(PokemonAndMoveTypes.FIRE, "Charizard", 78, 84, 78, 100, charizardMoves);
                
        }
        return null;
    }
}