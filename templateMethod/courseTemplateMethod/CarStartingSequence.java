package pl.awkwiecin.templateMethod.courseTemplateMethod;

public abstract class CarStartingSequence {

    public final void startTheCar() {
        fastenSeatBelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void go() {
        System.out.println("Naciskamy pedał gazu.");

    }

    private void fastenSeatBelts() {
        System.out.println("Zapinamy pasy.");
    }

    public abstract void startTheIgnition();
    public abstract void setTheGear();

}
