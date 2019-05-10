package pl.awkwiecin.memento.courseMemento;

class SmartAppMemento {

    private Double version;

    SmartAppMemento(Double version) {
        this.version = version;
    }

    Double getVersion() {
        return version;
    }
}
