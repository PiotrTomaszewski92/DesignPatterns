package creational.singleton;

public class GameEngine {

    private int hp=100;
    private String characterName = "";

    private static GameEngine instance = new GameEngine();

    private GameEngine(){}

    public synchronized static GameEngine getInstance(){
        return instance;
    }

    public void run(){
        while(true){
            //czekamy na input od gracza
            //zmieniamy stan gry
            //renderujemy grafikę
        }
    }
}

