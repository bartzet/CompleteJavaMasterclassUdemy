package com.bart;

/**
 * Created by bartziemba on 26/09/2017.
 */
public class Room {
    private Bed bed;
    private Door door;
    private Windows windows;

    public Room(Bed bed, Door door, Windows windows) {
        this.bed = bed;
        this.door = door;
        this.windows = windows;
    }

    public void closeWindow() {
        System.out.println("Window has been closed");
    }

    public void enterAndMove() {
        door.enterRoom();
        moveBed2Meters();
    }

    private void moveBed2Meters() {
        bed.moveBedFromWindow(2, "meters");
    }

    public Bed getBed() {
        return bed;
    }

    public Door getDoor() {
        return door;
    }

    public Windows getWindows() {
        return windows;
    }
}
