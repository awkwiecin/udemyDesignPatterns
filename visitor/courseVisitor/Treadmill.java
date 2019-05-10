package pl.awkwiecin.visitor.courseVisitor;

import co.devfoundry.visitor.courseVisitor.visitor.Visitor;
import pl.awkwiecin.visitor.courseVisitor.visitor.Visitor;

public class Treadmill implements Activity{

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getDistance() {
        return distance;
    }
}
