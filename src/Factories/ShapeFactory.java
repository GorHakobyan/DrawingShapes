package Factories;

import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape;
import Shapes.Triangle;

public class ShapeFactory {
    public static Shape createShape(Shape.Type type) {
        System.out.println(ShapeFactory.class + " is creating " + type.name());
        switch (type) {
            case CIRCLE -> {
                return new Circle();
            }
            case RECTANGLE -> {
                return new Rectangle();
            }
            case TRIANGLE -> {
                return new Triangle();
            }
        }

        return null;
    }
}
