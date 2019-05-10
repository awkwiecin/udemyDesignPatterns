package pl.awkwiecin.factory.abstractFactory;


public abstract class Factory {
    abstract public InfantryUnit createInfantryUnit(UnitType type);
    abstract public MechanizedUnit createMechanizedUnit(UnitType type);
    abstract public AirUnit createAirUnit(UnitType type);
}
