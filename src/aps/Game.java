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
        
        Move[] moves = {leafStorm, magmaStorm, waterfall, shockWave, skyAttack};
        
        // create pokemons 
        Pokemon raichu = PokemonFactory.createPokemon("raichu", moves);
        Pokemon heliolisk = PokemonFactory.createPokemon("heliolisk", moves);
        Pokemon dartrix = PokemonFactory.createPokemon("dartrix ", moves);
        Pokemon togekiss = PokemonFactory.createPokemon("togekiss", moves);
        Pokemon quilladin = PokemonFactory.createPokemon("quilladin", moves);
        Pokemon blastoise = PokemonFactory.createPokemon("blastoise", moves);
        Pokemon dewott = PokemonFactory.createPokemon("dewott", moves);
        Pokemon litten = PokemonFactory.createPokemon("litten", moves);
        Pokemon charizard = PokemonFactory.createPokemon("raichu", moves);

        // create players  

        // coach - pokemon

        // initialize game


        // select players


        // battle
    }
}
