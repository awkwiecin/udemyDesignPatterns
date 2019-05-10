package pl.awkwiecin.chainOfResponsibility.homeTask.child;

import co.devfoundry.chainOfResponsibility.homeTask.motherRequest.MotherRequest;
import pl.awkwiecin.chainOfResponsibility.homeTask.motherRequest.MotherRequest;

public class Ania extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.LOW)) {
            System.out.println("Ania zdjęła słoik z półki!");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
