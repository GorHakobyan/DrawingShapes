package Shapes;

import java.awt.*;

public class Triangle extends Shape {
    @Override
    public void  paintComponent(Graphics g)    {
        System.out.println(getName() + " is under construction");
    }
}
