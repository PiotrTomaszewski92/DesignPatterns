package behavioral.state;

public class CupFullState implements State {
    @Override
    public void insertTheCoins(CoffeeMachine coffeeMachine) {
        System.out.println("Take the cup first");
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachin) {
        System.out.println("Take the cup first");
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachin) {
        System.out.println("Took the cup");
        coffeeMachin.state = new NoCoinState();
    }

    @Override
    public void returnTheCoin(CoffeeMachine coffeeMachin) {
        System.out.println("Too late...");
    }
}

