package Task2_AbstractFactory;
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory("RoundedShape");
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        Shape square = shapeFactory.getShape("Square");
        square.draw();

        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();

        Shape roundedShape1 = roundedShapeFactory.getShape("RoundedRectangle");
        roundedShape1.draw();

        Shape roundedShape2 = roundedShapeFactory.getShape("RoundedSquare");
        roundedShape2.draw();
    }
}
