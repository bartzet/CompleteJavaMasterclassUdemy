package com.bart;

/**
 * Created by bartziemba on 19/09/2017.
 */
public class Car extends Vehicle {

    private int wheels;
    private int drivingWheel;
    private int gearShiftKnob;

    public Car(String color, String size, int windows, int wheels, int drivingWheel, int gearShiftKnob) {
        super(color, size, windows);
        this.wheels = wheels;
        this.drivingWheel = drivingWheel;
        this.gearShiftKnob = gearShiftKnob;
    }

    public void handSteering() {

    }

    public void changeGears() {

    }


}
