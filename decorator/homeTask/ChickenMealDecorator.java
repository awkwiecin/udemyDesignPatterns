package pl.awkwiecin.decorator.homeTask;

public class ChickenMealDecorator extends MealDecorator {

    public ChickenMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addChicken();
    }

    public void addChicken() {
        System.out.println("Do dania dodaję kurczaka.");
    }

}
