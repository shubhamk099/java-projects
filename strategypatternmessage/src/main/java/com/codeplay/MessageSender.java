package com.codeplay;

import com.codeplay.Strategy.SendingMethod;

public class MessageSender {
    SendingMethod sendingMethod;

    public MessageSender(SendingMethod sendingMethod) {
        this.sendingMethod = sendingMethod;
    }

    public void sendMessage(String from, String to, String message) {
        this.sendingMethod.send(from, to, message);
    }
}
