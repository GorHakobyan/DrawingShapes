package Shapes;

import java.awt.*;

public class Triangle extends Shape {
    @Override
    public void  paintComponent(Graphics g)    {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawPolygon(new int[] {325, 200, 450}, new int[] {0, 250, 250}, 3);
    }
}
