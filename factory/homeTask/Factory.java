package pl.awkwiecin.factory.homeTask;

public interface Factory {
    abstract public BMW buildBMW(BMWModel type);
    abstract public Ford buildFord(FordModel type);
}
