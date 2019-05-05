package aps;
/**
 *
 * @author Isabela Canelas Ett, RA: 21058253 / Pedro Henrique de Carvalho Silva, RA: 21201325
 */
public class MoveFactory {
    public static Move createMove(String name){
       switch(name){
            case "leafStorm":
                return new Move("Leaf Storm", 30, PokemonAndMoveTypes.GRASS, 7);
            case "magmaStorm": 
                return new Move("Magma Storm", 30, PokemonAndMoveTypes.FIRE, 9);
            case "waterfall": 
                return new Move("Waterfall", 20, PokemonAndMoveTypes.WATER, 9);
            case "shockWave":
                return new Move("Shock Wave", 35, PokemonAndMoveTypes.ELECTRIC, 5);
            case "skyAttack": 
                return new Move("Sky Attack", 30, PokemonAndMoveTypes.FLYING, 7);
       } 
        
       return null;
    }
}
