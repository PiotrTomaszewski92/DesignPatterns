package behavioral.observer.notification;

import behavioral.observer.order.Order;

public class TextMessage implements Observer {
    @Override
    public void update(Order order){
        System.out.println("SMS - Order number: "+order.getOrderNumber()+", new status: "+order.getOrderStatus());
    }
}

