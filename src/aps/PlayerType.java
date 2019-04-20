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
public enum PlayerType {
    PERSON(1), OPPONENT(2), GIMNASIUMLEADER(3);
    
    private final int value;
    private PlayerType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
