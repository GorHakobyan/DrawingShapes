package Shapes;

import java.awt.*;

public class Circle extends Shape {
    @Override
    public void  paintComponent(Graphics g)    {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawOval(200,0,250,250);
    }
}
