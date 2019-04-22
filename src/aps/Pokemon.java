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
    private double health;
    private float attackLevel;
    private float defenseLevel;
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

    public double getHealth() {
        return health;
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
    
    public float getAttackLevel() {
        return attackLevel;
    }

    public float getDefenseLevel() {
        return defenseLevel;
    }

    public int getSpeed() {
        return speed;
    }

    public Move[] getMoves() {
        return moves;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "type=" + type + ", name=" + name + ", level=" + level + ", health=" + health + ", attackLevel=" + attackLevel + ", defenseLevel=" + defenseLevel + ", speed=" + speed + ", moves=" + moves + '}';
    }
    
    
}