package CreationalPatterns.Factory;

public class FactoryPatternMain {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circleShape = shapeFactory.getShape(Shapes.CIRCLE);
        circleShape.draw();

        Shape squareShape = shapeFactory.getShape(Shapes.SQUARE);
        squareShape.draw();

        Shape rectangleShape = shapeFactory.getShape(Shapes.RECTANGLE);
        rectangleShape.draw();
    }
}
