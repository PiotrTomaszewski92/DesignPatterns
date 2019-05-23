package behavioral.observer.notification;

import behavioral.observer.order.Order;

public interface Observer {
    void update(Order order);
}

