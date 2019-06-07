package behavioral.state;

public class NoCoinState implements State {
    @Override
    public void insertTheCoins(CoffeeMachine coffeeMachine) {
        System.out.println("inserted coin");
        coffeeMachine.state = new CoinInsertedState();
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachin) {
        System.out.println("coin not inserted");
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachin) {
        System.out.println("coin not inserted");
    }

    @Override
    public void returnTheCoin(CoffeeMachine coffeeMachin) {
        System.out.println("coin not inserted");
    }
}

