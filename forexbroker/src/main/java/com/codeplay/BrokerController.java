package com.codeplay;

// invoker class
public class BrokerController {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.executeCommand();
    }
}
