package com.bart;

/**
 * Created by bartziemba on 19/09/2017.
 */
public class Vehicle {

    private String color;
    private String size;
    private int windows;

    private int currentVelocity = 0;
    private int currentDirection = 0;

    public Vehicle(String color, String size, int windows) {
        this.color = color;
        this.size = size;
        this.windows = windows;
    }

    public void steer (int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;

        System.out.println("Vehicle.move(): Moving at: " + currentVelocity + " in direction " + currentDirection);

    }
}
