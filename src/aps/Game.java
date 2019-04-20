/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;

/**
 *
 * @author pedro
 */
public class Game {
    public static void startGame() {
        // create Moves
        Move leafStorm = MoveFactory.createMove("leafStorm");
        Move magmaStorm = MoveFactory.createMove("magmaStorm");
        Move waterfall = MoveFactory.createMove("waterfall");
        Move shockWave = MoveFactory.createMove("shockWave");
        Move skyAttack = MoveFactory.createMove("skyAttack");

        // create pokemons 
        Pokemon raichu = PokemonFactory.createPokemon("raichu");
        Pokemon heliolisk = PokemonFactory.createPokemon("heliolisk");
        Pokemon dartrix = PokemonFactory.createPokemon("dartrix ");
        Pokemon togekiss = PokemonFactory.createPokemon("togekiss");
        Pokemon quilladin = PokemonFactory.createPokemon("quilladin");
        Pokemon blastoise = PokemonFactory.createPokemon("blastoise");
        Pokemon dewott = PokemonFactory.createPokemon("dewott");
        Pokemon litten = PokemonFactory.createPokemon("litten");
        Pokemon charizard = PokemonFactory.createPokemon("raichu");

        // create players  

        // coach - pokemon

        // initialize game


        // select players


        // battle
    }
}
