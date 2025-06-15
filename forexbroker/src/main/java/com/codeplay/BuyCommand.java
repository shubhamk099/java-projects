package com.codeplay;

public class BuyCommand implements Command {
    private Option option;

    public BuyCommand(Option option) {
        this.option = option;
    }

    @Override
    public void executeCommand() {
        option.buy();
    }

}
