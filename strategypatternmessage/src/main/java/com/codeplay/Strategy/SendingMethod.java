package com.codeplay.Strategy;

// the strategy interface
public interface SendingMethod {
    public void send(String from, String to, String message);
}
