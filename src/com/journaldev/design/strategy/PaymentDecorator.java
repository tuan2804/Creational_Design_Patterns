package com.journaldev.design.strategy;

public abstract class PaymentDecorator implements PaymentStrategy {
    protected PaymentStrategy wrapped;

    public PaymentDecorator(PaymentStrategy wrapped) {
        this.wrapped = wrapped;
    }

    public void pay(int amount) {
        wrapped.pay(amount);
    }
}
