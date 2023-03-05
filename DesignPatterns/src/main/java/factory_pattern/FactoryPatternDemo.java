package factory_pattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shapeCircle = shapeFactory.getShape("Circle");
        shapeCircle.draw();

        Shape shapeRectangle = shapeFactory.getShape("Rectangle");
        shapeRectangle.draw();

        Shape shapeSquare = shapeFactory.getShape("Square");
        shapeSquare.draw();
    }
}
