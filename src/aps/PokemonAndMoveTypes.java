package aps;
/**
 *
 * @author Isabela Canelas Ett, RA: 21058253 / Pedro Henrique de Carvalho Silva, RA: 21201325
 */
public enum PokemonAndMoveTypes {
    ELECTRIC(5), FLYING(4), GRASS(3), WATER(2), FIRE(1);
    
    private final int value;
    private PokemonAndMoveTypes(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
