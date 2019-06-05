package behavioral.strategy.chef.egg_cooker;

public class HardBoiledEggCooker implements EggCooker {
    @Override
    public void cookEgg() {
        System.out.println("Hard boiled eggs.");
    }
}

