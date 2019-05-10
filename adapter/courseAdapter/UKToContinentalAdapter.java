package pl.awkwiecin.adapter.courseAdapter;

public class UKToContinentalAdapter implements ContinentalDevice {

    UKDevice device;

    public UKToContinentalAdapter(UKDevice device) {
        this.device = device;
    }

    public void on() {

        device.powerOn();

    }
}
