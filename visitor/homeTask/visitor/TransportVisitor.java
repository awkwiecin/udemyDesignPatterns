package pl.awkwiecin.visitor.homeTask.visitor;

import co.devfoundry.visitor.homeTask.Animal;
import co.devfoundry.visitor.homeTask.Person;
import co.devfoundry.visitor.homeTask.Shipment;
import pl.awkwiecin.visitor.homeTask.Person;
import pl.awkwiecin.visitor.homeTask.Shipment;

public interface TransportVisitor {

    void visit(Animal animal);
    void visit(Person person);
    void visit(Shipment shipment);

}
