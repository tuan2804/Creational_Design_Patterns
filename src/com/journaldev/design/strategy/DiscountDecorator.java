package com.journaldev.design.strategy;

public class DiscountDecorator extends PaymentDecorator {
    public DiscountDecorator(PaymentStrategy wrapped) {
        super(wrapped);
    }

    public void pay(int amount) {
        int newAmount = (int) (amount * 0.9);
        System.out.println("Áp dụng giảm giá 10%");
        super.pay(newAmount);
    }
}
