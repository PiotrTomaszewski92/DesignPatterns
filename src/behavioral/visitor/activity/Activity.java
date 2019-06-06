package behavioral.visitor.activity;

import behavioral.visitor.visitor.Visitor;

public interface Activity {
    void accept(Visitor visitor);
}

