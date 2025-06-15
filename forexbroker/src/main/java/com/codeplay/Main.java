package com.codeplay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] amountList = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            amountList[i] = scanner.nextInt();
        }

        BrokerController broker = new BrokerController();
        for (int i = 0; i < 3; i++) {
            Option option = new Option(amountList[i]);
            Command command;
            if (amountList[i] > 0) {
                command = new BuyCommand(option);

            } else {
                command = new SellCommand(option);

            }
            broker.setCommand(command);
            broker.pressButton();
        }

        scanner.close();
    }
}