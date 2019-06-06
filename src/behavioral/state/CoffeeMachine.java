package behavioral.state;

public class CoffeeMachine {
    State state;

    public CoffeeMachine() {
        this.state = State.NO_COIN;
    }

    public void insertTheCoin(){
        switch (state){
            case NO_COIN:
                System.out.println("inserted coin");
                state = State.COIN_INSERTED;
                break;
            case COIN_INSERTED:
                System.out.println("inserted coin already");
                break;
            case CUP_FULL:
                System.out.println("Take the cup first");
                break;
        }
    }
    public void pushTheButton(){
        switch (state){
            case NO_COIN:
                System.out.println("coin not inserted");
                break;
            case COIN_INSERTED:
                System.out.println("make a coffee");
                state = State.CUP_FULL;
                break;
            case CUP_FULL:
                System.out.println("Take the cup first");
                break;
        }
    }
    public void takeTheCup(){
        switch (state){
            case NO_COIN:
                System.out.println("coin not inserted");
                break;
            case COIN_INSERTED:
                System.out.println("push the button");
                break;
            case CUP_FULL:
                System.out.println("Took the cup");
                state = State.NO_COIN;
                break;
        }
    }

    public void returnTheCoin(){
        switch (state){
            case NO_COIN:
                System.out.println("coin not inserted");
                break;
            case COIN_INSERTED:
                System.out.println("return the coin");
                state = State.NO_COIN;
                break;
            case CUP_FULL:
                System.out.println("Too late...");
                break;
        }
    }

    public enum State{
        NO_COIN, COIN_INSERTED, CUP_FULL;
    }
}


