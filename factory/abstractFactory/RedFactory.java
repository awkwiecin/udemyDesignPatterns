package pl.awkwiecin.factory.abstractFactory;

public class RedFactory extends Factory {
    @Override
    public InfantryUnit createInfantryUnit(UnitType type) {
        switch (type) {
            case RIFLEMAN:
                return new Rifleman(20, 0, 6);

            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }

    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type) {
            case TANK:
                return new Tank(75, 0, 35);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }

    }


    @Override
    public AirUnit createAirUnit(UnitType type) {
        switch (type) {
            case HELICOPTER:
                return new Helicopter(10, 0, 600);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }

    }
}
