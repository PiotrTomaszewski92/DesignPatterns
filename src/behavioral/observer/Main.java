package behavioral.observer;

import behavioral.observer.notification.Email;
import behavioral.observer.notification.MobileApp;
import behavioral.observer.notification.TextMessage;
import behavioral.observer.order.Order;
import behavioral.observer.order.OrderStatus;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(110L, OrderStatus.REGISTERED);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObserver(); //wypisze wszystkie wiadomości
        order.changeOrderStatus(OrderStatus.SENT); //zmiana statusu zamowienia
        //==========================
        order.unregisterObserver(email);
        order.changeOrderStatus(OrderStatus.RECEIVED);
    }
}


