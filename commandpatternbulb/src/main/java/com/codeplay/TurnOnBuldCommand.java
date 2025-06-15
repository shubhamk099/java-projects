package com.codeplay;

public class TurnOnBuldCommand implements ICommand {
    private LightBulb lightbulb;

    TurnOnBuldCommand(LightBulb lightbulb) {
        this.lightbulb = lightbulb;
    }

    @Override
    public void execute() {
        lightbulb.turnOnBulb();
    }

    @Override
    public void undo() {
        lightbulb.turnOfBulb();
    }
}
