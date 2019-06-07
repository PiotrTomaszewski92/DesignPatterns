package structural.facade;

import structural.facade.deliverybox.DeliveryBox;
import structural.facade.deliverybox.DeliveryBoxFacade;
import structural.facade.deliverybox.DeliveryBoxSystem;

public class Main {
    public static void main(String[] args) {
        DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();
        deliveryBoxFacade.pickupPackage();
    }
}

