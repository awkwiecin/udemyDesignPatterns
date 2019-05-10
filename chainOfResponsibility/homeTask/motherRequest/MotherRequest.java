package pl.awkwiecin.chainOfResponsibility.homeTask.motherRequest;

import co.devfoundry.chainOfResponsibility.homeTask.child.Shelf;

public class MotherRequest {

    private Shelf shelf;

    public MotherRequest(Shelf shelf) {
        this.shelf = shelf;
    }

    public Shelf getShelf() {
        return shelf;
    }
}
