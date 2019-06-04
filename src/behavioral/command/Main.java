package behavioral.command;

public class Main {
    public static void main(String[] args) {
        WorkshopApp workshopApp = new WorkshopApp(new Robot());
        workshopApp.run();
    }
}

