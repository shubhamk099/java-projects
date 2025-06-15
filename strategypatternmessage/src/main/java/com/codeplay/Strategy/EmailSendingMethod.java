package com.codeplay.Strategy;

public class EmailSendingMethod implements SendingMethod {

    @Override
    public void send(String from, String to, String message) {
        System.out.println(String.format("EMAIL : %s - send from %s to %s", message, from, to));

    }
}
