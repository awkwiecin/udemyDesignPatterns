package pl.awkwiecin.visitor.courseVisitor;

import co.devfoundry.visitor.courseVisitor.visitor.Visitor;

public  interface Activity {

    void accept(Visitor visitor);

}