package structural.facade.deliverybox;

public class DeliveryBox {

    public boolean isDeliveryBoxFull(){
        System.out.println("Delivery box is not full");
        return false;
    }

    public boolean isDeliveryBoxBroken(){
        System.out.println("Delivery box is not broken");
        return false;
    }

    public void getUserData(){
        System.out.println("User data entered.");
    }

    public void openBox(){
        System.out.println("Box opened");
    }
}

