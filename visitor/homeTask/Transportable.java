package pl.awkwiecin.visitor.homeTask;

import co.devfoundry.visitor.homeTask.visitor.TransportVisitor;
import pl.awkwiecin.visitor.homeTask.visitor.TransportVisitor;

public interface Transportable {

    void accept(TransportVisitor transportVisitor);

}
