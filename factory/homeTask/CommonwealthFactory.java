package pl.awkwiecin.factory.homeTask;

public class CommonwealthFactory implements Factory {

    public BMW buildBMW(BMWModel type) {
        switch (type) {
            case X5:
                return new BMW(60, FuelType.PETROL, 1994, SteeringWheelPosition.LEFT);
            case E60:
                return new BMW(100, FuelType.DIESEL, 1939, SteeringWheelPosition.LEFT);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    public Ford buildFord(FordModel type) {
        switch (type) {
            case CMAX:
                return new Ford(40, FuelType.DIESEL, 2016, SteeringWheelPosition.LEFT);
            case Focus:
                return new Ford(10, FuelType.GAS, 2012, SteeringWheelPosition.LEFT);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }
}
