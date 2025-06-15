package com.codeplay;

public class TurnOffBulbCommand implements ICommand {
    LightBulb lightbulb;

    TurnOffBulbCommand(LightBulb lightbulb) {
        this.lightbulb = lightbulb;
    }

    @Override
    public void execute() {
        lightbulb.turnOfBulb();
    }

    @Override
    public void undo() {
        lightbulb.turnOnBulb();
    }
}
