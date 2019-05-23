package behavioral.observer.notification;

import behavioral.observer.order.Order;

public class Email implements Observer{
    @Override
    public void update(Order order) {
        System.out.println("EMAIL - Order number: "+order.getOrderNumber()+", new status: "+order.getOrderStatus());
    }
}

