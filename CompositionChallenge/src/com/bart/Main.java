package com.bart;

public class Main {

    public static void main(String[] args) {

        Bed bed = new Bed(1);
        Door door = new Door(2);
        //Windows windows = new Windows(4);

        Room room = new Room(bed, door, new Windows(4));

        room.getDoor().enterRoom();

        room.enterAndMove();

        room.closeWindow();

    }
}
