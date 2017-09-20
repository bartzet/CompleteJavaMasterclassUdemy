package com.bart;

/**
 * Created by bartziemba on 19/09/2017.
 */
public class Car extends Vehicle {

    private int wheels;
    private int drivingWheel;
    private int geers;
    private boolean isManual;
    private int currentGear;

    public Car(String color, String size, int windows, int wheels, int drivingWheel, int geers, boolean isManual) {
        super(color, size, windows);
        this.wheels = wheels;
        this.drivingWheel = drivingWheel;
        this.geers = geers;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentgeGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity: Velocity is " + speed + " and direction is " + direction);
    }
}
