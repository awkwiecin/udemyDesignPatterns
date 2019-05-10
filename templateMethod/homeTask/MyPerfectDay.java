package pl.awkwiecin.templateMethod.homeTask;

public class MyPerfectDay extends MyDay {
    protected void work() {
        System.out.println("Code, code, COODE!");
    }
    public int goToWork(TypeOfTransport transport) {
        switch (transport) {
            case CAR:
                return 20;
            case BIKE:
                return 30;
            case TRAM:
                return 10;
            default:
                return 20;
        }
    }
}
