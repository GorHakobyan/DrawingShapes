import Factories.ShapeFactory;
import Shapes.Shape;

public class Main {

    public static void main(String[] args) {
        final int WIDTH = 500;
        final int HEIGHT = 500;
        final String NAME = "Drawing Shapes";
        var mainWindow = new WindowManager(WIDTH, HEIGHT, NAME);

        mainWindow.addShape(ShapeFactory.createShape(Shape.Type.RECTANGLE));
    }
}