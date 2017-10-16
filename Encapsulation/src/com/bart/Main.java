package com.bart;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 88;
//        player.weapon = "AK47";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining player's health is " + player.healthRemaining());
//
//        damage = 78;
//        player.loseHealth(damage);
//        System.out.println("Remaining player's health is " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 100, "Sword");
        System.out.println("Initial health is " + player.getHealth());


    }
}
