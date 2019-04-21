/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class PokemonBattle {
    public static void pokemonBattle(Player player1, Player player2) {
        int currentPokemon1Health;
        int currentPokemon2Health;
        do {
            int round = 1;
            Pokemon currentPokemonPlayer1 = player1.getPokemons()[0] != null ? player1.getPokemons()[0] : player1.getPokemons()[1];
            Pokemon currentPokemonPlayer2 = player2.getPokemons()[0] != null ? player2.getPokemons()[0] : player2.getPokemons()[1];
            currentPokemon1Health = currentPokemonPlayer1.getHealth();
            currentPokemon2Health = currentPokemonPlayer2.getHealth();
            Random rand = new Random();
            
            int player1QtyPokemon = 0;
            int player2QtyPokemon = 0;
            
            for (int i = 0; i < player1.getPokemons().length; i++) {
                if(player1.getPokemons()[i] != null) {
                    player1QtyPokemon += 1;
                }
            }
            
            for (int i = 0; i < player2.getPokemons().length; i++) {
                if(player2.getPokemons()[i] != null) {
                    player2QtyPokemon += 1;
                }
            }
            
            System.out.println("Player 1 has " + player1QtyPokemon + "pokemons");
            System.out.println("Player 2 has " + player2QtyPokemon + "pokemons");
            System.out.println(round + " " + currentPokemonPlayer1.getName() + " (LV" + currentPokemonPlayer1.getLevel() + ") " + currentPokemon1Health + "/" + currentPokemonPlayer1.getHealth());
            System.out.println("vs");
            System.out.println(round + " " + currentPokemonPlayer2.getName() + " (LV" + currentPokemonPlayer2.getLevel() + ") " + currentPokemon2Health + "/" + currentPokemonPlayer2.getHealth());
            System.out.println("Which attack your " + currentPokemonPlayer1 + " will be using?");

            if (currentPokemonPlayer1.getMoves()[0].getQtyUse() > 0) {
                    System.out.println("(1) " + currentPokemonPlayer1.getMoves()[0].getType());
            } 

            if (currentPokemonPlayer1.getMoves()[1].getQtyUse() > 0) {
                    System.out.println("(2) " + currentPokemonPlayer1.getMoves()[1].getType());
            } 

            if (currentPokemonPlayer1.getMoves()[2].getQtyUse() > 0) {
                    System.out.println("(3) " + currentPokemonPlayer1.getMoves()[2].getType());
            } 

            if (currentPokemonPlayer1.getMoves()[3].getQtyUse() > 0) {
                    System.out.println("(4) " + currentPokemonPlayer1.getMoves()[3].getType());
            }

            Scanner scanner = new Scanner(System.in);
            Move currentPlayer1Move = currentPokemonPlayer1.getMoves()[scanner.nextInt() - 1];

            // checks if the player can actually use the chosen move
            if (currentPlayer1Move.getQtyUse() <= 0) {
                    System.out.println("Invalid move, try again :)");	
                    break;
            }

            Move currentPlayer2Move = currentPokemonPlayer2.getMoves()[rand.nextInt(4)];

            int randPlayer = 0;

            if (currentPokemonPlayer1.getSpeed() == currentPokemonPlayer2.getSpeed()) {
                    randPlayer = rand.nextInt(2);
            }

            if (currentPokemonPlayer1.getSpeed() > currentPokemonPlayer2.getSpeed() || randPlayer == 0) { // player 1 attacks first
                    double modifier = currentPokemonPlayer1.getType().getValue() > currentPokemonPlayer2.getType().getValue() ? 0.5 : 1.5; 
                    double damage = ((currentPokemonPlayer1.getAttackLevel() + currentPlayer1Move.getPower()) - currentPokemonPlayer2.getDefenseLevel()) * modifier;
                    currentPokemon2Health -= damage;
            } else if (currentPokemonPlayer1.getSpeed() < currentPokemonPlayer2.getSpeed() || randPlayer == 1) { // player 2 attacks first
                    double modifier = currentPokemonPlayer2.getType().getValue() > currentPokemonPlayer1.getType().getValue() ? 0.5 : 1.5; 
                    double damage = ((currentPokemonPlayer2.getAttackLevel() + currentPlayer2Move.getPower()) - currentPokemonPlayer1.getDefenseLevel()) * modifier;
                    currentPokemon1Health -= damage;
            }

        } while (currentPokemon1Health > 0 && currentPokemon2Health > 0);	
    }
}
