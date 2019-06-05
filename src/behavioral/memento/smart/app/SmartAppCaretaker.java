package behavioral.memento.smart.app;

import java.util.ArrayList;
import java.util.List;

public class SmartAppCaretaker {
    private List<SmartAppMemento> smartAppMementos = new ArrayList<>();

    public void addMemento(SmartAppMemento smartAppMemento){
        smartAppMementos.add(smartAppMemento);
        System.out.println("save version: "+smartAppMemento.getVersion()+", indeks: "+(smartAppMementos.size()-1));
    }

    public SmartAppMemento getMemento(int index){
        System.out.println("get version: "+smartAppMementos.get(index).getVersion());
        return smartAppMementos.get(index);

    }
}

