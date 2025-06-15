package com.codeplay;

import com.codeplay.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    // this is known as constructor injection
    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
