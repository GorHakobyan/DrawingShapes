import java.awt.event.ActionListener;

public class ButtonFactory {
    public static int startX = 0;
    public static int startY = 0;
    public static final int WIDTH = 200;
    public static final int HEIGHT = 30;

    public static Button createButton(String name, ActionListener listener) {
        var button = new Button(name, listener);
        button.setBounds(startX, startY, WIDTH, HEIGHT);
        startY = startY + HEIGHT;
        return button;
    }

}
