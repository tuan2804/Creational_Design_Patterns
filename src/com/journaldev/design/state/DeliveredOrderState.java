package com.journaldev.design.state;

public class DeliveredOrderState implements OrderState{
	public void handleOrder(OrderContext context) {
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }
}
