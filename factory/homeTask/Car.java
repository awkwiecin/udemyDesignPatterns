package pl.awkwiecin.factory.homeTask;

public abstract class Car {
    private int engineVolume;
    private FuelType fuelType;
    private int yearOfProduction;
    private SteeringWheelPosition steeringWheelPosition;

    protected Car(int engineVolume, FuelType fuelType, int yearOfProduction, SteeringWheelPosition steeringWheelPosition) {
        this.engineVolume = engineVolume;
        this.fuelType = fuelType;
        this.yearOfProduction = yearOfProduction;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return steeringWheelPosition;
    }
}
