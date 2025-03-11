package com.journaldev.design.state;

public class ProcessingOrderState implements OrderState{

	public void handleOrder(OrderContext context) {
        System.out.println("Đóng gói và vận chuyển.");
        context.setState(new DeliveredOrderState());
    }

}
