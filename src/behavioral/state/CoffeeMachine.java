package behavioral.state;

public class CoffeeMachine {
    State state;

    public CoffeeMachine() {
        this.state = new NoCoinState();
    }

    public void insertTheCoin(){
        state.insertTheCoins(this);
    }

    public void pushTheButton(){
        state.pushTheButton(this);

    }
    public void takeTheCup(){
        state.takeTheCup(this);
    }

    public void returnTheCoin(){
        state.returnTheCoin(this);
    }
}


