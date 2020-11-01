package Task2_AbstractFactory;

public class RoundedShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }else if (shape.equalsIgnoreCase("RoundedRectangle")) {
            return new RoundedRectangle();
        } else if (shape.equalsIgnoreCase("RoundedSquare")) {
            return new RoundedSquare();
        }
        return null;
    }
}
