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
        double currentPokemon1Health = -9999;
        double currentPokemon2Health = -9999;
        do {
            int currentPokemonPlayer1Index = player1.getPokemons()[0] != null ? 0 : 1;
            Pokemon currentPokemonPlayer1 = player1.getPokemons()[currentPokemonPlayer1Index];
            
            System.out.println("index player1 " + currentPokemonPlayer1Index);
            Pokemon currentPokemonPlayer2 = player2.getPokemons()[0] != null ? player2.getPokemons()[0] : player2.getPokemons()[1];
            int currentPokemonPlayer2Index = player2.getPokemons()[0] != null ? 0 : 1;
            System.out.println("index player2 " + currentPokemonPlayer2Index);
            currentPokemon1Health = currentPokemon1Health > 0 ? currentPokemon1Health : currentPokemonPlayer1.getHealth();
            currentPokemon2Health = currentPokemon2Health > 0 ? currentPokemon2Health : currentPokemonPlayer2.getHealth();
            int round = 1;

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

            do {
                System.out.println("Player 1 has " + player1QtyPokemon + " pokemons");
                System.out.println("Player 2 has " + player2QtyPokemon + " pokemons");
                System.out.println("Round: " + round);
                System.out.println(currentPokemonPlayer1.getName() + " (LV" + currentPokemonPlayer1.getLevel() + ") " + currentPokemon1Health + "/" + currentPokemonPlayer1.getHealth());
                System.out.println("vs");
                System.out.println(currentPokemonPlayer2.getName() + " (LV" + currentPokemonPlayer2.getLevel() + ") " + currentPokemon2Health + "/" + currentPokemonPlayer2.getHealth());
                System.out.println("Which attack your " + currentPokemonPlayer1.getName() + " will be using?");
                
                Scanner scanner = new Scanner(System.in);
                int moveIndex;
                Move currentPlayer1Move;
                
                do {
                    for (int i = 0; i < 4; i++) {
                        if (currentPokemonPlayer1.getMoves()[i].getQtyUse() > 0) {
                                System.out.println("(" + (i + 1) + ") " + currentPokemonPlayer1.getMoves()[i].getType());
                        } 
                    }
                    moveIndex = scanner.nextInt() - 1;
                    if(moveIndex < 0 || moveIndex >= 4) {
                        System.out.println("Invalid move :( ");
                    } else if(currentPokemonPlayer1.getMoves()[moveIndex].getQtyUse() <= 0) {
                        System.out.println("Invalid move :( ");
                    }
                } while (moveIndex < 0 || moveIndex >= 4 || currentPokemonPlayer1.getMoves()[moveIndex].getQtyUse() <= 0);
                
                currentPlayer1Move = currentPokemonPlayer1.getMoves()[moveIndex];
                int tempPlayer1MoveQtyUse = currentPlayer1Move.getQtyUse();
                currentPlayer1Move.setQtyUse(currentPlayer1Move.getQtyUse() - 1);
                        
                Move currentPlayer2Move;
                do {
                    currentPlayer2Move = currentPokemonPlayer2.getMoves()[rand.nextInt(4)];
                } while(currentPlayer2Move.getQtyUse() <= 0 || (player2.getType().getValue() == 3 && currentPlayer2Move.getType().getValue() < currentPokemonPlayer1.getType().getValue()));

                int randPlayer = 1;
                if (currentPokemonPlayer1.getSpeed() == currentPokemonPlayer2.getSpeed()) {
                        randPlayer = rand.nextInt(2);
                }
                double modifier = 1;
                double damage;

                if (currentPokemonPlayer1.getSpeed() > currentPokemonPlayer2.getSpeed() || randPlayer == 0) { // player 1 attacks first
                    if (currentPlayer1Move.getType().getValue() != currentPokemonPlayer2.getType().getValue()) {
                        modifier = currentPlayer1Move.getType().getValue() > currentPokemonPlayer2.getType().getValue() ? 1.5 : 0.5; 
                    }
                    damage = ((currentPokemonPlayer1.getAttackLevel() + currentPlayer1Move.getPower()) - currentPokemonPlayer2.getDefenseLevel()) * modifier;
                    currentPokemon2Health -= damage;

                    System.out.println("health" + currentPokemon1Health);
                    System.out.println("health" + currentPokemon2Health);
                    if (currentPokemon2Health > 0){
                        if (currentPlayer2Move.getType().getValue() != currentPokemonPlayer1.getType().getValue()) {
                            modifier = currentPlayer2Move.getType().getValue() > currentPokemonPlayer1.getType().getValue() ? 1.5 : 0.5; 
                        }
                        damage = ( currentPokemonPlayer2.getAttackLevel() + currentPlayer2Move.getPower() - currentPokemonPlayer1.getDefenseLevel()) * modifier;
                        damage = currentPokemonPlayer2.getLevel() == 75 ? damage * 1.25 : damage; 
                        currentPokemon1Health -= damage;
                        if (currentPokemon1Health <= 0) {
                            UpdatePlayerPokemons.updatePlayerPokemons(player1, currentPokemonPlayer1Index);
                            currentPlayer1Move.setQtyUse(tempPlayer1MoveQtyUse);
                        } 
                    }else{
                        UpdatePlayerPokemons.updatePlayerPokemons(player2, currentPokemonPlayer2Index);
                    }
                } else if (currentPokemonPlayer1.getSpeed() < currentPokemonPlayer2.getSpeed() || randPlayer == 1) { // player 2 attacks first
                    if (currentPlayer2Move.getType().getValue() != currentPokemonPlayer1.getType().getValue()) {
                        modifier = currentPlayer2Move.getType().getValue() > currentPokemonPlayer1.getType().getValue() ? 1.5 : 0.5; 
                    }
                    damage = ((currentPokemonPlayer2.getAttackLevel() + currentPlayer2Move.getPower()) - currentPokemonPlayer1.getDefenseLevel()) * modifier;
                    damage = currentPokemonPlayer2.getLevel() == 75 ? damage * 1.25 : damage;
                    currentPokemon1Health -= damage;

                    System.out.println("health" + currentPokemon1Health);
                    System.out.println("health" + currentPokemon2Health + "\n");

                    if(currentPokemon1Health > 0){
                        if (currentPlayer1Move.getType().getValue() != currentPokemonPlayer2.getType().getValue()) {
                            modifier = currentPlayer1Move.getType().getValue() > currentPokemonPlayer2.getType().getValue() ? 1.5 : 0.5; 
                        }
                       damage = ((currentPokemonPlayer1.getAttackLevel() + currentPlayer1Move.getPower()) - currentPokemonPlayer2.getDefenseLevel()) * modifier;
                       currentPokemon2Health -= damage; 

                       if (currentPokemon2Health <= 0) {
                           UpdatePlayerPokemons.updatePlayerPokemons(player2, currentPokemonPlayer2Index);
                       } 

                    }else{
                        UpdatePlayerPokemons.updatePlayerPokemons(player1, currentPokemonPlayer1Index);
                        currentPlayer1Move.setQtyUse(tempPlayer1MoveQtyUse);
                    }
                }

                round += 1;
            } while (currentPokemon1Health > 0 && currentPokemon2Health > 0);
        } while ((player1.getPokemons()[0] != null || player1.getPokemons()[1] != null) && (player2.getPokemons()[0] != null || player2.getPokemons()[1] != null) );
    }
}
