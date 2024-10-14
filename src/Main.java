import Shapes.Shape;
import Factories.ShapeFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>() {
            {
                add(ShapeFactory.createShape(Shape.Type.CIRCLE));
                add(ShapeFactory.createShape(Shape.Type.RECTANGLE));
                add(ShapeFactory.createShape(Shape.Type.TRIANGLE));
            }
        };

        for(var shape : shapes)
        {
            System.out.println(shape.getClass());
        }
    }
}