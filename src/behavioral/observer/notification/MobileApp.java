package behavioral.observer.notification;

import behavioral.observer.order.Order;

public class MobileApp {
    public void updateOrderStatus(Order order){
        System.out.println("Mobile App - Order number: "+order.getOrderNumber()+", new status: "+order.getOrderStatus());
    }
}

