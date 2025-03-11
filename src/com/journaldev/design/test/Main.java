package com.journaldev.design.test;

import com.journaldev.design.state.*;
import com.journaldev.design.strategy.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Quản lý đơn hàng ===");
        OrderContext order = new OrderContext();
        order.processOrder();
        order.processOrder();
        order.processOrder();

        System.out.println("\n=== Tính toán thuế ===");
        Product product1 = new Product("Laptop", 1000, new VATTax());
        System.out.println("Giá cuối cùng: " + product1.getFinalPrice());

        Product product2 = new Product("Nhẫn vàng", 2000, new LuxuryTax());
        System.out.println("Giá cuối cùng: " + product2.getFinalPrice());

        System.out.println("\n=== Thanh toán ===");
        PaymentStrategy payment = new CreditCardStrategy();
        payment = new ProcessingFeeDecorator(payment);
        payment = new DiscountDecorator(payment);
        payment.pay(100);
    }
}
