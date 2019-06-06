package behavioral.visitor.visitor;

import behavioral.visitor.activity.Squash;
import behavioral.visitor.activity.Treadmill;
import behavioral.visitor.activity.Weights;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(Treadmill treadmill) {
        System.out.println("Calories burned running on treadmill: "+treadmill.getDistance());
    }

    @Override
    public void visit(Squash squash) {
        System.out.println("Calories burned playing squash: "+squash.getMinutesPlayed() * 20);
    }

    @Override
    public void visit(Weights weights) {
        System.out.println("Calories burned lifting weights: "+ weights.getWeight()*weights.getReps()*2);
    }
}

