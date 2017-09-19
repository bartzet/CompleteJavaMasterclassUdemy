package com.bart;

/**
 * Created by bartziemba on 19/09/2017.
 */
public class OpelAstra extends Car{

    private int frontSpoiler;
    private int backSpoiler;

    public OpelAstra(String color, String size, int windows, int gearShoftKnob, int frontSpoiler, int backSpoiler) {
        super(color, size, windows, 4, 1, gearShoftKnob);
        this.frontSpoiler = frontSpoiler;
        this.backSpoiler = backSpoiler;
    }

    public void drift() {
        super.move(50);
    }
}
