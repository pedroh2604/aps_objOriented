/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
        
        Pokemon[] pokemons = {raichu, heliolisk, dartrix, togekiss, quilladin, blastoise, dewott, litten, charizard}; 
        
        // create players  
        Player opponent1 = PlayerFactory.createPlayer(PlayerType.OPPONENT1.getValue(), pokemons);
        Player opponent2 = PlayerFactory.createPlayer(PlayerType.OPPONENT2.getValue(), pokemons);
        Player gimnasiumLeader = PlayerFactory.createPlayer(PlayerType.GIMNASIUMLEADER.getValue(), pokemons);
        Player player1 = PlayerFactory.createPlayer(PlayerType.PERSON.getValue(), pokemons);
        
        
        // select players
        System.out.println("Who do you want to battle with?");
        System.out.println("1: Opponent 1");
        System.out.println("2: Opponent 2");
        System.out.println("3: Gimnasium Leader");
        
        Scanner scanner = new Scanner(System.in);
        int opponentChoice = scanner.nextInt();
        Player player2;
        
        
        switch(opponentChoice){
            case 1:
               player2 = opponent1; 
               break;
            case 2:
               player2 = opponent2; 
               break;  
            case 3:
               player2 = gimnasiumLeader; 
               break;
            default:
                player2 = opponent1; 
        }
        
        // makes sure the pokemons will be the same after the battle
        Pokemon[] tempPokemonsPlayer1 = player1.getPokemons();
        Pokemon[] tempPokemonsPlayer2 = player2.getPokemons();
        
        //select pokemon order
        System.out.println("Your Pokemons are: " + player1.getPokemons()[0].getName()+ " and " + player1.getPokemons()[1].getName());
        System.out.println("Which Pokemon do you want to play with first? 1 or 2?");
        int pokemonOrder = scanner.nextInt();
        
        if (pokemonOrder == 2){
            Pokemon[] invertedPokemons = player1.getPokemons();
            for (int i = 0; i < invertedPokemons.length / 2; i++) {
                Pokemon temp = invertedPokemons[i];
                invertedPokemons[i] = invertedPokemons[invertedPokemons.length - 1 - i];
                invertedPokemons[invertedPokemons.length - 1 - i] = temp;
            }
            player1.setPokemons(invertedPokemons);
        }
        
        // battle
        PokemonBattle.pokemonBattle(player1, player2);
        
        if (player1.getPokemons()[0] != null && player1.getPokemons()[1] != null) {
            System.out.println("Player 2 won, congrats");
        } else if ((player2.getPokemons()[0] != null && player2.getPokemons()[1] != null)) {
            System.out.println("Player 1 won, congrats");
        }
        
        player1.setPokemons(tempPokemonsPlayer1);
        player2.setPokemons(tempPokemonsPlayer2);
    }
}
