package com.journaldev.design.state;

public class CancelledOrderState implements OrderState{
	public void handleOrder(OrderContext context) {
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}
