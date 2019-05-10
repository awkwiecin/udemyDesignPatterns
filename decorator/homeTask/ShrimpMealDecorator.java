package pl.awkwiecin.decorator.homeTask;

public class ShrimpMealDecorator extends MealDecorator {

    public ShrimpMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addShrimp();
    }

    public void addShrimp() {
        System.out.println("Do dania dodaję krewetki.");
    }
}
