package pl.awkwiecin.memento.homeTask;

public class OperatingSystemMemento {

    private int backupNumber;

    public OperatingSystemMemento(int backupNumber) {
        this.backupNumber = backupNumber;
    }

    public int getBackupNumber() {
        return backupNumber;
    }
}
