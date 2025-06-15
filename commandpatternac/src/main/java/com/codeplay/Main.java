package com.codeplay;

public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();

        MyRemoteControl remoteObj = new MyRemoteControl();

        remoteObj.setCommand(new TurnACOnCommand(ac));

        remoteObj.pressButton();

        remoteObj.undo();
    }
}