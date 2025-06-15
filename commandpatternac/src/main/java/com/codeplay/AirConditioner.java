package com.codeplay;

public class AirConditioner {
    private boolean isOn;
    private int temperature;

    public void turnOnAC() {
        isOn = true;
        System.out.println("AC is turned ON");
    }

    public void turnOfAC() {
        isOn = false;
        System.out.println("AC is turned OFF");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to " + temperature);
    }

    public void acStatus() {
        System.out.println(isOn);
        System.out.println(temperature);
    }
}
