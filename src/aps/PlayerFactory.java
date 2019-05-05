package aps;
/**
 *
 * @author Isabela Canelas Ett, RA: 21058253 / Pedro Henrique de Carvalho Silva, RA: 21201325
 */
public class PlayerFactory {
    public static Player createPlayer(int playerType, Pokemon[] pokemons){
        switch(playerType){
            case 1:
                Pokemon[] opponent1Pokemons = {pokemons[0],pokemons[1]};
                return new Player(PlayerType.OPPONENT1, opponent1Pokemons);
            case 2:
                Pokemon[] opponent2Pokemons = {pokemons[2],pokemons[3]};
                return new Player(PlayerType.OPPONENT2, opponent2Pokemons);
            case 3:
                Pokemon[] gimnasiumLeaderPokemons = {pokemons[6],pokemons[7]};
                return new Player(PlayerType.GIMNASIUMLEADER, gimnasiumLeaderPokemons);
            case 4:
                Pokemon[] personPokemons = {pokemons[4],pokemons[5]};
                return new Player(PlayerType.PERSON, personPokemons);
        }
        return null;
    } 
} 
