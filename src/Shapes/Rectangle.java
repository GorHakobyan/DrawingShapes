package Shapes;

import java.awt.*;

public class Rectangle extends Shape {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(0,0,250,250);
    }
}
