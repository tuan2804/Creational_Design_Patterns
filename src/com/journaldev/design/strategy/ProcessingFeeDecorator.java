package com.journaldev.design.strategy;

public class ProcessingFeeDecorator extends PaymentDecorator {
    public ProcessingFeeDecorator(PaymentStrategy wrapped) {
        super(wrapped);
    }

    public void pay(int amount) {
        int newAmount = amount + 5;
        System.out.println("Thêm phí xử lý 5$");
        super.pay(newAmount);
    }
}
