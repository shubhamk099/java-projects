package com.codeplay.Strategy;

public class ElectricDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Electric Drive Capability");
    }
}
