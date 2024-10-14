package Factories;

import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape;
import Shapes.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShapeFactoryTest {
    @Test
    public void createCircle() {
        var circle = ShapeFactory.createShape(Shape.Type.CIRCLE);
        var actualCircle = new Circle();

        Assertions.assertNotNull(circle);
        Assertions.assertEquals(circle.getClass(), actualCircle.getClass());
    }

    @Test
    public void createRectangle() {
        var rectangle = ShapeFactory.createShape(Shape.Type.RECTANGLE);
        var actualCircle = new Rectangle();

        Assertions.assertNotNull(rectangle);
        Assertions.assertEquals(rectangle.getClass(), actualCircle.getClass());
    }

    @Test
    public void createTriangle() {
        var triangle = ShapeFactory.createShape(Shape.Type.TRIANGLE);
        var actualTriangle = new Triangle();

        Assertions.assertNotNull(triangle);
        Assertions.assertEquals(triangle.getClass(), actualTriangle.getClass());
    }
}