import Factories.ShapeFactory;
import Shapes.Shape;
import javax.swing.*;

public class WindowManager {

    private final int m_width;
    private final int m_height;
    private final String m_name;
    private Shape m_currentShape;
    private final JFrame m_window;

    public WindowManager(int width, int height, String name) {
        m_width = width;
        m_height = height;
        m_name = name;
        m_window = new JFrame();
        m_currentShape = null;

        initWindow();
    }

    public void addShape(Shape shape) {
        if(m_currentShape != null) {
            System.out.println("Removing existing shape from window: " + m_currentShape.getClass());
            m_window.remove(m_currentShape);
        }
        m_currentShape = shape;
        System.out.println("Adding new shape to the window: " + m_currentShape.getClass());
        m_window.add(m_currentShape);
        m_window.setVisible(true);
    }

    private void initWindow() {
        m_window.setSize(m_width, m_height);
        m_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m_window.setTitle(m_name);

        var createRectangleBtn = ButtonFactory.createButton("Create Rectangle", _ -> addShape(ShapeFactory.createShape(Shape.Type.RECTANGLE)));
        var createCircleButton = ButtonFactory.createButton("Create Circle", _ -> addShape(ShapeFactory.createShape(Shape.Type.CIRCLE)));

        m_window.add(createRectangleBtn);
        m_window.add(createCircleButton);
    }
}
