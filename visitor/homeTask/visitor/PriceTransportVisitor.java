package pl.awkwiecin.visitor.homeTask.visitor;

import co.devfoundry.visitor.homeTask.Animal;
import co.devfoundry.visitor.homeTask.Person;
import co.devfoundry.visitor.homeTask.Shipment;
import pl.awkwiecin.visitor.homeTask.Animal;
import pl.awkwiecin.visitor.homeTask.Person;
import pl.awkwiecin.visitor.homeTask.Shipment;

public class PriceTransportVisitor implements TransportVisitor {
    @Override
    public void visit(Animal animal) {
        System.out.println("Cena zwierza: " + animal.getWeight()*0.2);
    }

    @Override
    public void visit(Person person) {
        int price = 6;
        if (person.isRegularCustomer()) {
            price = price / 2;
        }
        System.out.println("Cena przejazdu człowieka: "
                + price + " PLN");
    }

    @Override
    public void visit(Shipment shipment) {
        int price=2;
        if(shipment.isLarge())
            System.out.println("Cena towaru: " + price*3);
        else
            System.out.println("Cena towaru: " + price);
    }
}
