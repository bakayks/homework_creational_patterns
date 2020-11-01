package Task5_Prototype;

import java.util.HashMap;

public class ShapeCache {
    private static HashMap<String, Shape> shapeMap  = new HashMap<>();

    public static Shape getShape(String shapeId) {
        Shape shape = shapeMap.get(shapeId);
        return (Shape) shape.clone();
    }

    public static void loadCache() {
        Square square = new Square();
        square.setId("1");
        shapeMap.put(square.getId(), square);

        Circle circle = new Circle();
        circle.setId("2");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
