package Shapes;

import java.awt.*;

public class Circle extends Shape {
    @Override
    public void  paintComponent(Graphics g)    {
        System.out.println(getName() + " is under construction");
    }
}
