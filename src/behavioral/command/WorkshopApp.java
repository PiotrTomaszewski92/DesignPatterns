package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class WorkshopApp {
    private List<Command> commandQueue = new ArrayList<>();

    public void addToQueue(Command command){
        commandQueue.add(command);
    }

    void run(){
        if(commandQueue.isEmpty())
            System.out.println("Empty queue");
        for (Command command : commandQueue)
            command.execute();
        commandQueue.clear();
    }
}


