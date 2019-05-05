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
                return new Pokemon(PokemonAndMoveTypes.ELECTRIC, "Raichu", 50, 160, 90, 55, 100, raichuMoves);         
            case "heliolisk":
                Move[] helioliskMoves = {moves[1],moves[2],moves[3],moves[4]};
                return new Pokemon(PokemonAndMoveTypes.ELECTRIC, "Heliolisk", 50, 162, 55, 52, 100, helioliskMoves);                
            case "dartrix":
                Move[] dartrixMoves = {moves[0],moves[2],moves[3],moves[4]};
                return new Pokemon(PokemonAndMoveTypes.FLYING, "Dartrix", 50, 178, 75, 75, 52, dartrixMoves);
            case "togekiss":
                Move[] togekissMoves = {moves[0],moves[1],moves[3],moves[4]};
                return new Pokemon(PokemonAndMoveTypes.FLYING, "Togekiss", 50, 185, 50, 95, 80, togekissMoves);                
            case "quilladin":
                Move[] quilladinMoves = {moves[0],moves[1],moves[2],moves[3]};
                return new Pokemon(PokemonAndMoveTypes.GRASS, "Quilladin", 50, 161, 78, 65, 57, quilladinMoves);                
            case "blastoise":
                Move[] blastoiseMoves = {moves[1],moves[2],moves[3],moves[4]};
                return new Pokemon(PokemonAndMoveTypes.WATER, "Blastoise", 50, 179, 83, 73, 78, blastoiseMoves);               
            case "dewott":
                Move[] dewottMoves = {moves[0],moves[1],moves[2],moves[4]};
                return new Pokemon(PokemonAndMoveTypes.WATER, "Dewott", 75, 175, 75, 60, 60, dewottMoves);               
            case "litten":
                Move[] littenMoves = {moves[0],moves[1],moves[2],moves[4]};
                return new Pokemon(PokemonAndMoveTypes.FIRE, "Litten", 75, 145, 65, 50, 70, littenMoves);               
            
                
        }
        return null;
    }
}