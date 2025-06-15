package com.codeplay;

import com.codeplay.Strategy.EmailSendingMethod;
import com.codeplay.Strategy.SmsSendingMethod;

public class Main {
    public static void main(String[] args) {
        MessageSender smsMessage = new MessageSender(new SmsSendingMethod());
        smsMessage.sendMessage("Shubham", "Mahi", "Hello");

        MessageSender emailMessage = new MessageSender(new EmailSendingMethod());
        emailMessage.sendMessage("Mahi", "Shubham", "Hey");
    }
}