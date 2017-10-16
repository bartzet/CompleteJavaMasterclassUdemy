package com.bart;

class Car {

    private boolean engine;
    private int wheels;
    private int cylinders;

    public Car(boolean engine, int wheels, int cylinders) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = 8;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "CAR ->  Start engine";
    }

    public String accelerate() {
        return "Speed up!";
    }

    public String brake() {
        return "Stop the car!";
    }
}

class PorscheCarrera extends Car {
    public PorscheCarrera(boolean engine, int wheels, int cylinders) {
        super(engine, wheels, cylinders);
    }

    @Override
    public String startEngine() {
        return "Carrera ->  Start engine";
    }

    @Override
    public String accelerate() {
        return "Carrera ->  accelerate";
    }

    @Override
    public String brake() {
        return "Carrera ->  brake";
    }
}

class Fiat extends Car {
    public Fiat(boolean engine, int wheels, int cylinders) {
        super(engine, wheels, cylinders);
    }

    @Override
    public String startEngine() {
        return "Fiat ->  Start engine";
    }

    @Override
    public String accelerate() {
        return "Fiat ->  accelerate";
    }

    @Override
    public String brake() {
        return "Fiat ->  brake";
    }
}

class Ford extends Car {
    public Ford(boolean engine, int wheels, int cylinders) {
        super(engine, wheels, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ford ->  Start engine";
    }

    @Override
    public String accelerate() {
        return "Ford ->  accelerate";
    }

    @Override
    public String brake() {
        return "Ford ->  brake";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car(true, 4, 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        PorscheCarrera porscheCarrera = new PorscheCarrera(true, 4, 16);
        System.out.println(porscheCarrera.startEngine());
        System.out.println(porscheCarrera.accelerate());
        System.out.println(porscheCarrera.brake());

        Ford ford = new Ford(true, 4, 20);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}
