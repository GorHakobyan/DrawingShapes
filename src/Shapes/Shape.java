package Shapes;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent {
    public enum Type {
        CIRCLE,
        RECTANGLE,
        TRIANGLE
    }

    @Override
    public abstract void paintComponent(Graphics g);
}
