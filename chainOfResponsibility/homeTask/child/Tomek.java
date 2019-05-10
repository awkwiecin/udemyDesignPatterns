package pl.awkwiecin.chainOfResponsibility.homeTask.child;

import co.devfoundry.chainOfResponsibility.homeTask.motherRequest.MotherRequest;

public class Tomek extends Child{

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.MEDIUM)) {
            System.out.println("Tomek zdjął słoik z półki!");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
