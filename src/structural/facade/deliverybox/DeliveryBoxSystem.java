package structural.facade.deliverybox;

public class DeliveryBoxSystem {

    public void sendNotification(){
        System.out.println("Text message send to the client.");
    }

    public boolean isPaymentSecured(){
        System.out.println("Payment has been secured.");
        return true;
    }

    public boolean isUserDataValidated(){
        System.out.println("User data has been validated.");
        return true;
    }

    public void scheduleDelivery(){
        System.out.println("Delivery has been scheduled.");
    }
}

