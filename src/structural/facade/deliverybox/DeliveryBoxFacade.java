package structural.facade.deliverybox;

public class DeliveryBoxFacade {
    DeliveryBox deliveryBox;
    DeliveryBoxSystem deliveryBoxSystem;

    public DeliveryBoxFacade() {
        this.deliveryBox = new DeliveryBox();
        this.deliveryBoxSystem = new DeliveryBoxSystem();
    }

    public void pickupPackage(){
        deliveryBox.getUserData();
        if(deliveryBoxSystem.isUserDataValidated() && deliveryBoxSystem.isPaymentSecured()){
            deliveryBox.openBox();
        }
    }
}

