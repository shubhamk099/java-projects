package com.codeplay;

import com.codeplay.Strategy.ElectricDriveStrategy;

public class ElectricVehicle extends Vehicle {
    ElectricVehicle() {
        super(new ElectricDriveStrategy());
    }
}
