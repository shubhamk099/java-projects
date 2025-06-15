package com.codeplay;

public abstract class PaymentFlow {
    public abstract void validateRequest();

    public abstract void calculateFees();

    public abstract void debitMoney();

    public abstract void creditMoney();

    // template method
    public final void sendMoney() {
        // step-1
        validateRequest();

        // step-2
        debitMoney();

        // step-3
        calculateFees();

        // step-4
        creditMoney();
    }
}
