
import javax.swing.*;
import java.awt.event.ActionListener;

public class Button extends JButton {
    public Button(String label, ActionListener listener) {
        super(label);
        addActionListener(listener);
    }
}