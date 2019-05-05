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
public class Move implements Cloneable{
    private String name;
    private int power;
    private PokemonAndMoveTypes type;
    private int qtyUse;

    public Move(String name, int power, PokemonAndMoveTypes type, int qtyUse) {
        this.name = name;
        this.power = power;
        this.type = type;
        this.qtyUse = qtyUse;
    }

    public int getQtyUse() {
        return qtyUse;
    }

    public void setQtyUse(int qtyUse) {
        this.qtyUse = qtyUse;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public PokemonAndMoveTypes getType() {
        return type;
    }
    
    public Object clone()throws CloneNotSupportedException{  
        return super.clone();  
    }  
    
}
