package com.bart;

/**
 * Created by bartziemba on 24/09/2017.
 */
public class Motherboard {

    private String model;
    private String manufacture;
    private int ramSlots;
    private int cardSlots;
    private int bios;

    public Motherboard(String model, String manufacture, int ramSlots, int cardSlots, int bios) {
        this.model = model;
        this.manufacture = manufacture;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println(" Program name " + programName + " is now loading...");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public void setCardSlots(int cardSlots) {
        this.cardSlots = cardSlots;
    }

    public int getBios() {
        return bios;
    }

    public void setBios(int bios) {
        this.bios = bios;
    }
}
