package behavioral.observer.notification;

import behavioral.observer.order.Order;

public class TextMessage {
    public void updateOrderStatus(Order order){
        System.out.println("SMS - Order number: "+order.getOrderNumber()+", new status: "+order.getOrderStatus());
    }
}

