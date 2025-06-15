package com.codeplay;

public class PayToMerchant extends PaymentFlow {
    @Override
    public void calculateFees() {
        System.out.println("2% fees charged");

    }

    @Override
    public void creditMoney() {
        System.out.println("amount credited to receiver's account");

    }

    @Override
    public void debitMoney() {
        System.out.println("amount debited from sender's account");

    }

    @Override
    public void validateRequest() {
        System.out.println("payment request successfully verified");
    }
}
