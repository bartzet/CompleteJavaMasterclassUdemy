package com.bart;

/**
 * Created by bartziemba on 26/09/2017.
 */
public class Bed {
    private int numberOfBeds;
    private Door door;

    public Bed(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public void moveBedFromWindow(int distance, String unit) {
        System.out.println("Move bed " + distance + unit + " from window.");
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }
}
