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
public class UpdatePlayerPokemons {
    public static void updatePlayerPokemons(Player player, int currentPokemonPlayerIndex) {
        if (currentPokemonPlayerIndex == 0) {
            Pokemon[] updatedPlayer1Pokemons = {null, player.getPokemons()[1]};
            player.setPokemons(updatedPlayer1Pokemons);
        } else {
            Pokemon[] updatedPlayer1Pokemons = {null, null};
            player.setPokemons(updatedPlayer1Pokemons);
        }
    }
}
