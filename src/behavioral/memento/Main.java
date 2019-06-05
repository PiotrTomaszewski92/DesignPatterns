package behavioral.memento;
import behavioral.memento.smart.app.SmartApp;
import behavioral.memento.smart.app.SmartAppCaretaker;

public class Main {
    public static void main(String[] args) {
        SmartAppCaretaker sac = new SmartAppCaretaker();
        SmartApp smartApp = new SmartApp();

        smartApp.changeVersion(1.0);
        smartApp.changeVersion(1.1);
        smartApp.changeVersion(1.2);
        sac.addMemento(smartApp.save());

        smartApp.changeVersion(2.0);
        smartApp.changeVersion(2.1);
        sac.addMemento(smartApp.save());
        smartApp.changeVersion(2.2);
        //rollback do wersji 1.2
        smartApp.load(sac.getMemento(0));
    }
}




