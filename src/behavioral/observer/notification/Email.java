package behavioral.observer.notification;

import behavioral.observer.order.Order;

public class Email {
    public void updateOrderStatus(Order order){
        System.out.println("EMAIL - Order number: "+order.getOrderNumber()+", new status: "+order.getOrderStatus());
    }
}

