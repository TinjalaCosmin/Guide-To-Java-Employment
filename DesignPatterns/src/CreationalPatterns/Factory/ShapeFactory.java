package CreationalPatterns.Factory;

public class ShapeFactory {

    public Shape getShape(Shapes shape) {
        if (shape == null) {
            return null;
        }
        if (shape == Shapes.CIRCLE) {
            return new Circle();
        } else if (shape == Shapes.SQUARE) {
            return new Square();
        } else if (shape == Shapes.RECTANGLE) {
            return new Rectangle();
        }

        return null;
    }
}
