package creational.builder;

import creational.builder.house.House;

public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .buildWalls("walls")
                .buildFloors("floors")
                .buildRoof("roof")
                .buildRooms("kitchen")
                .build();

        System.out.println(house);
    }
}

