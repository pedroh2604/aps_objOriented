/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;

/**
 *
 * @author lab801
 */
public class Player {
    private PlayerType type;
    private Pokemon pokemons[] = new Pokemon[2];

    public Player(PlayerType type, Pokemon[] pokemons) {
        this.type = type;
        this.pokemons = pokemons;
    }
    
    public PlayerType getType() {
        return type;
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public void setPokemons(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }
    
    
}
