package behavioral.state;

public interface State {
    void insertTheCoins(CoffeeMachine coffeeMachine);
    void pushTheButton(CoffeeMachine coffeeMachin);
    void takeTheCup(CoffeeMachine coffeeMachin);
    void returnTheCoin(CoffeeMachine coffeeMachin);
}

