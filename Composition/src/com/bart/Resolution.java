package com.bart;

/**
 * Created by bartziemba on 26/09/2017.
 */
public class Resolution {
    private int withd;
    private int height;

    public Resolution(int withd, int height) {
        this.withd = withd;
        this.height = height;
    }

    public int getWithd() {
        return withd;
    }

    public int getHeight() {
        return height;
    }
}
