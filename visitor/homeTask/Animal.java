package pl.awkwiecin.visitor.homeTask;

import co.devfoundry.visitor.homeTask.visitor.TransportVisitor;
import pl.awkwiecin.visitor.homeTask.visitor.TransportVisitor;

public class Animal implements Transportable {

    private String kind;
    private int weight;

    public Animal(String kind, int weight) {
        this.kind = kind;
        this.weight = weight;
    }

    public String getKind() {
        return kind;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void accept(TransportVisitor transportVisitor) {
        transportVisitor.visit(this);
    }
}
