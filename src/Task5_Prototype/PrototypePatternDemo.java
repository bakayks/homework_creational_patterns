package Task5_Prototype;

public class PrototypePatternDemo {

    public static void main(String[] args) {

        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape1 : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape2 : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape3 : " + clonedShape3.getType());
    }

}
