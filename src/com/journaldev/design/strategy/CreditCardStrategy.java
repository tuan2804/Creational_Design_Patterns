package com.journaldev.design.strategy;

public class CreditCardStrategy implements PaymentStrategy {
	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Thanh toán " + amount + " bằng thẻ tín dụng.");
	}
}
