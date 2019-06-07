package behavioral.state;

public class CoinInsertedState implements State {
    @Override
    public void insertTheCoins(CoffeeMachine coffeeMachine) {
        System.out.println("inserted coin already");
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachin) {
        System.out.println("make a coffee");
        coffeeMachin.state = new CupFullState();
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachin) {
        System.out.println("push the button");
    }

    @Override
    public void returnTheCoin(CoffeeMachine coffeeMachin) {
        System.out.println("return the coin");
        coffeeMachin.state = new NoCoinState();
    }
}

