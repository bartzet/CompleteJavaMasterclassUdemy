package com.bart;

/**
 * Created by bartziemba on 24/09/2017.
 */
public class Car extends Vehicle {

    private int doors;
    private int engineCapacity;

    public Car(int name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
