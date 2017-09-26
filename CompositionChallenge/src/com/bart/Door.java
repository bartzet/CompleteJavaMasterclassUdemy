package com.bart;

/**
 * Created by bartziemba on 26/09/2017.
 */
public class Door {
    private int numberOfDoor;
    private Windows windows;

    public void enterRoom() {
        System.out.println("You have entered a room");
    }

    public Door(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }
}
