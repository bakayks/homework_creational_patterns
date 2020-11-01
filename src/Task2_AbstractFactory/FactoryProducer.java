package Task2_AbstractFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Shape")){
            return new ShapeFactory();

        }else if(choice.equalsIgnoreCase("RoundedShape")){
            return new RoundedShapeFactory();
        }
        return null;
    }
}
