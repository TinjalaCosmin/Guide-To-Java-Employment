package CreationalPatterns.AbstractFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
        Shape roundedRectangle = roundedShapeFactory.getShape("RECTANGLE");
        roundedRectangle.draw();
        Shape roundedSquare = roundedShapeFactory.getShape("SQUARE");
        roundedSquare.draw();
    }
}
