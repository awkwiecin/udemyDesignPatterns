package pl.awkwiecin.visitor.courseVisitor;

import co.devfoundry.visitor.courseVisitor.visitor.Visitor;
import pl.awkwiecin.visitor.courseVisitor.visitor.Visitor;

public class Weights implements Activity{
    private int weight;
    private int reps;

    public Weights(int weight, int reps) {
        this.weight = weight;
        this.reps = reps;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getWeight() {
        return weight;
    }

    public int getReps() {
        return reps;
    }

}
