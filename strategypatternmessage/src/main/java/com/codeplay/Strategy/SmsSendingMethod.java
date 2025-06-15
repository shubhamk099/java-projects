package com.codeplay.Strategy;

public class SmsSendingMethod implements SendingMethod {

    @Override
    public void send(String from, String to, String message) {
        System.out.println(String.format("SMS : %s - send from %s to %s", message, from, to));
    }
}
