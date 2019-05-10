package pl.awkwiecin.visitor.homeTask.visitor;

import co.devfoundry.visitor.homeTask.Animal;
import co.devfoundry.visitor.homeTask.Person;
import co.devfoundry.visitor.homeTask.Shipment;
import pl.awkwiecin.visitor.homeTask.Animal;
import pl.awkwiecin.visitor.homeTask.Person;
import pl.awkwiecin.visitor.homeTask.Shipment;

public class NameTransportVisitor implements TransportVisitor {
    @Override
    public void visit(Animal animal) {
        System.out.println("Rodzaj zwierza: " + animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println("Osoba: " + person.getFirstName() + " " + person.getLastName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println("Towar: " + shipment.getPrefix() + " " + shipment.getSerialNumber());
    }
}
