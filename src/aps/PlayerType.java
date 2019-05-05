package aps;
/**
 *
 * @author Isabela Canelas Ett, RA: 21058253 / Pedro Henrique de Carvalho Silva, RA: 21201325
 */
public enum PlayerType {
    OPPONENT1(1), OPPONENT2(2), GIMNASIUMLEADER(3), PERSON(4);
    
    private final int value;
    private PlayerType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
