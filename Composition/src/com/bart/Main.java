package com.bart;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 75, 80);

        Case theCase = new Case("220B", "DELL", "240", dimensions);

        Monitor monitor = new Monitor("FD-4456", "Samsung", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("2432", "Asus", 4, 6, 2);

        PC pc = new PC(theCase, monitor, motherboard);

        pc.powerUp();


    }
}
