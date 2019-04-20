/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;

/**
 *        kkkkk pd pa
 * @author lab801
 */
public enum PlayerType {
    OPPONENT1(1), OPPONENT2(2), PERSON(3), GIMNASIUMLEADER(4);
    
    private final int value;
    private PlayerType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
