package behavioral.strategy;

import behavioral.strategy.chef.Chef;

public class Main {
    public static void main(String[] args) {
        //new order - eggs
        Chef chef = new Chef("Gordon Gessler");
        chef.cook();

    }
}
