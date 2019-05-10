package pl.awkwiecin.memento.homeTask;

import java.util.ArrayList;
import java.util.List;

public class OperatingSystemCaretaker {

    private OperatingSystemMemento operatingSystemMemento;

    public void addMemento(OperatingSystemMemento operatingSystemMemento) {

        this.operatingSystemMemento=operatingSystemMemento;
        System.out.println("Zapisana wersja: " + operatingSystemMemento.getBackupNumber() );
    }

    public OperatingSystemMemento getMemento () {
        System.out.println("Wczytano wersję: " + operatingSystemMemento.getBackupNumber());
        return this.operatingSystemMemento;
    }

}
