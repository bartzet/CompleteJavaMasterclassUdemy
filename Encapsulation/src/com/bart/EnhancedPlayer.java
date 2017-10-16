package com.bart;

/**
 * Created by bartziemba on 26/09/2017.
 */
public class EnhancedPlayer {

    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int hitPoints, String weapon) {
        this.name = name;
        this.hitPoints = hitPoints;

        if (hitPoints > 0 && hitPoints <= 100) {
            this.hitPoints = hitPoints;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player is knocked out");
            //Reduce number of lives remiaining for played
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
