package behavioral.templateMethod;

public abstract class CarStartingSequence  {

    public final void startTheCar(){
        fastenSeatbelts();
        startTheIgnition();
        setTheGear();
        go();
    }
    private void fastenSeatbelts() {
        System.out.println("Zapinamy pasy");
    }
    private void go(){
        System.out.println("Wciskamy pedał gazu");
    }

    public abstract void startTheIgnition();
    public abstract void setTheGear();
}

