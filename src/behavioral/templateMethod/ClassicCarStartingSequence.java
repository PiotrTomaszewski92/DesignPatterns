package behavioral.templateMethod;

public class ClassicCarStartingSequence extends CarStartingSequence{

    public void startTheIgnition(){
        System.out.println("Przekręcamy kluczyc");
    }
    public void setTheGear(){
        System.out.println("Wybieramy bieg");
    }
}

