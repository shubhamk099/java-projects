package com.codeplay;

public class Main {
    public static void main(String[] args) {
        PaymentFlow paymentFlowFriend = new PayToFriend();
        paymentFlowFriend.sendMoney();

        PaymentFlow paymentFlowMerchant = new PayToMerchant();
        paymentFlowMerchant.sendMoney();
    }
}