package com.codeplay;

public class LightBulb {
    private boolean isOn;

    public void turnOnBulb() {
        isOn = true;
        System.out.println("The light bulb is turned ON");
    }

    public void turnOfBulb() {
        isOn = false;
        System.out.println("The light bulb is turned OFF");
    }

    void checkBulbStatus() {
        System.out.println(isOn);
    }
}
