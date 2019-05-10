package pl.awkwiecin.visitor.courseVisitor.visitor;

import co.devfoundry.visitor.courseVisitor.Squash;
import co.devfoundry.visitor.courseVisitor.Treadmill;
import co.devfoundry.visitor.courseVisitor.Weights;

public class VisitorImpl implements Visitor{
    @Override
    public void visit(Treadmill treadmill) {
        System.out.println("Calories burned running on threadmill " + treadmill.getDistance()*3);
    }

    @Override
    public void visit(Weights weights) {
        System.out.println("Calories burned lifting weights " + weights.getWeight() * weights.getReps() * 2);
    }

    @Override
    public void visit(Squash squash) {
        System.out.println("Calories burned playiong squash " + squash.getMinutesPlayed()*20);
    }
}
