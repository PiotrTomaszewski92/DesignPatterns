package behavioral.strategy;

import behavioral.strategy.chef.Chef;
import behavioral.strategy.chef.egg_cooker.HardBoiledEggCooker;
import behavioral.strategy.chef.egg_cooker.SoftBoiledEggCooker;

public class Main {
    public static void main(String[] args) {
        //new order - eggs
        Chef chef = new Chef("Gordon Gessler");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();

    }
}
