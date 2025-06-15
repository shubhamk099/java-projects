package com.codeplay;

public class SellCommand implements Command {
    private Option option;

    public SellCommand(Option option) {
        this.option = option;
    }

    @Override
    public void executeCommand() {
        option.sell();
    }
}
