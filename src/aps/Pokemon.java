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
public class Pokemon {
    private  PokemonAndMoveTypes type;
    private String name;
    private int level;
    private int health;
    private int attackLevel;
    private int defenseLevel;
    private int speed;
    private Move moves[] = new Move[4];

    public Pokemon(PokemonAndMoveTypes type, String name,int level, int health, int attackLevel, int defenseLevel, int speed, Move[] moves) {
        this.type = type;
        this.name = name;
        this.level = level;
        this.health = health;
        this.attackLevel = attackLevel;
        this.defenseLevel = defenseLevel;
        this.speed = speed;
        this.moves = moves;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public PokemonAndMoveTypes getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
       return level;
    }
    
    public int getAttackLevel() {
        return attackLevel;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public int getSpeed() {
        return speed;
    }

    public Move[] getMoves() {
        return moves;
    }
}