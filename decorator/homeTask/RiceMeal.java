package pl.awkwiecin.decorator.homeTask;

public class RiceMeal extends Meal{

    public RiceMeal() {}

    @Override
    public void prepareMeal() {
        System.out.println("Przygotowuję danie na bazie ryżu.");
    }
}
