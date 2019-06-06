package behavioral.visitor;

import behavioral.visitor.activity.Squash;
import behavioral.visitor.activity.Treadmill;
import behavioral.visitor.activity.Weights;

public class Main {
    public static void main(String[] args) {
        Treadmill treadmill = new Treadmill(200);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50,10);

        treadmill.calculateCaloriesBurned();
        squash.calculateCaloriesBurned();
        weights.calculateCaloriesBurned();
    }

}
