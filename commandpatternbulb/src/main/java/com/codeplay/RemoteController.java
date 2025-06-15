package com.codeplay;

import java.util.Stack;

public class RemoteController {
    private ICommand command;
    private Stack<ICommand> bulbCommandHistory = new Stack<>();

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        bulbCommandHistory.add(command);
    }

    public void undo() {
        if (!bulbCommandHistory.isEmpty()) {
            ICommand lastCommand = bulbCommandHistory.pop();
            lastCommand.undo();
        }
    }
}
