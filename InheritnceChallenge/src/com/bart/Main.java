package com.bart;

public class Main {

    public static void main(String[] args) {
        OpelAstra opelastra = new OpelAstra(24);
        opelastra.steer(45);
        opelastra.accelerate(30);
        opelastra.accelerate(20);
        opelastra.accelerate(-42);
    }
}
