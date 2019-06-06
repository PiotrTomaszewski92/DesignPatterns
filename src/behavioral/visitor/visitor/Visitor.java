package behavioral.visitor.visitor;

import behavioral.visitor.activity.Squash;
import behavioral.visitor.activity.Treadmill;
import behavioral.visitor.activity.Weights;

public interface Visitor {
    void visit(Treadmill treadmill);
    void visit(Squash squash);
    void visit(Weights weights);
}

