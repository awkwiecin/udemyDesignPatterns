package pl.awkwiecin.chainOfResponsibility.homeTask.child;

import co.devfoundry.chainOfResponsibility.homeTask.motherRequest.MotherRequest;
import pl.awkwiecin.chainOfResponsibility.homeTask.motherRequest.MotherRequest;

public abstract class Child {

    private Child tallerChild;

    public abstract void processRequest (MotherRequest motherRequest);

    public Child() {}

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }

    public Child getTallerChild() {
        return tallerChild;
    }
}
