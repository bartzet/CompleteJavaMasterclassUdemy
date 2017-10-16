package com.bart;

/**
 * Created by bartziemba on 26/09/2017.
 */
public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player is knocked out");
            //Reduce number of lives remiaining for played
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
