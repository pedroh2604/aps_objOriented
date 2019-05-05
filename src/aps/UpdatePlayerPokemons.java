package aps;
/**
 *
 * @author Isabela Canelas Ett, RA: 21058253 / Pedro Henrique de Carvalho Silva, RA: 21201325
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
