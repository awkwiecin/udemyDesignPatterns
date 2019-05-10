package pl.awkwiecin.factory.homeTask;

public class ContinentalFactory implements Factory {

    public BMW buildBMW(BMWModel type) {
        switch (type) {
            case X5:
                return new BMW(60, FuelType.PETROL, 1994, SteeringWheelPosition.RIGHT);
            case E60:
                return new BMW(100, FuelType.DIESEL, 1939, SteeringWheelPosition.RIGHT);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    public Ford buildFord(FordModel type) {
        switch (type) {
            case CMAX:
                return new Ford(40, FuelType.DIESEL, 2016, SteeringWheelPosition.RIGHT);
            case Focus:
                return new Ford(10, FuelType.GAS, 2012, SteeringWheelPosition.RIGHT);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

}
