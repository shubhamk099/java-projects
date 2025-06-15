package com.codeplay;

import java.util.Stack;

public class MyRemoteControl {
    ICommand command;
    Stack<ICommand> acCommandHistory = new Stack<>();

    MyRemoteControl() {
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        acCommandHistory.add(command);
    }

    public void undo() {

        if (!acCommandHistory.isEmpty()) {
            ICommand lastCommand = acCommandHistory.pop();
            lastCommand.undo();
        }
    }
}
