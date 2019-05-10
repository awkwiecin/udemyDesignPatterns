package pl.awkwiecin.visitor.courseVisitor.visitor;

import co.devfoundry.visitor.courseVisitor.Squash;
import co.devfoundry.visitor.courseVisitor.Treadmill;
import co.devfoundry.visitor.courseVisitor.Weights;

public interface Visitor {

    void visit(Treadmill treadmill);
    void visit(Weights weights);
    void visit(Squash squash);


}
