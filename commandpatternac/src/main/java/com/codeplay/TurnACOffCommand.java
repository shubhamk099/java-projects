package com.codeplay;

public class TurnACOffCommand implements ICommand {
    AirConditioner ac;

    TurnACOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOfAC();
    }

    @Override
    public void undo() {
        ac.turnOnAC();
    }
}
