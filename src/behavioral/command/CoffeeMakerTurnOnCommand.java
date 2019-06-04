package behavioral.command;

public class CoffeeMakerTurnOnCommand implements Command {
    CoffeeMaker coffeeMaker;

    public CoffeeMakerTurnOnCommand(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        coffeeMaker.turnOn();
    }

    @Override
    public void undo() {
coffeeMaker.turnOff();
    }
}

