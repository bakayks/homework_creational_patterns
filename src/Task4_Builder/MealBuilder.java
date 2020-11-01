package Task4_Builder;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal veganMeal = new Meal();
        veganMeal.addItem(new VegBurger());
        veganMeal.addItem(new Pepsi());
        return veganMeal;
    }

    public Meal prepareNonVegMeal() {
        Meal nonVeganMeal = new Meal();
        nonVeganMeal.addItem(new ChickenBurger());
        nonVeganMeal.addItem(new Coke());
        return nonVeganMeal;
    }
}
