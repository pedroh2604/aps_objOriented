package aps;
/**
 *
 * @author Isabela Canelas Ett, RA: 21058253 / Pedro Henrique de Carvalho Silva, RA: 21201325
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

    @Override
    public String toString() {
        return "Player{" + "pokemons=" + pokemons + '}';
    }
    
}
