package behavioral.visitor.activity;

public class Treadmill {

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public void calculateCaloriesBurned(){
        System.out.println("Calories burned running on treadmill: "+distance);
    }
}

