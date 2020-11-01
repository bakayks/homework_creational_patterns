package Task4_Builder;

public class VegBurger extends Burger {

    @Override
    public float price() {
        return 59.0f;
    }

    @Override
    public String name() {
        return "Vegan Burger";
    }
}
