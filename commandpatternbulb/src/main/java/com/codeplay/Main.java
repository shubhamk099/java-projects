package com.codeplay;

public class Main {
    public static void main(String[] args) {
        LightBulb phillipsBulb = new LightBulb();
        RemoteController remoteController = new RemoteController();

        ICommand lightOn = new TurnOnBuldCommand(phillipsBulb);
        ICommand lightOff = new TurnOffBulbCommand(phillipsBulb);

        remoteController.setCommand(lightOn);
        remoteController.pressButton();

        remoteController.setCommand(lightOff);
        remoteController.pressButton();

        remoteController.undo();
    }
}