import javax.swing.*;
import java.awt.*;

public class TextLabel extends JLabel {
    JLabel txt;


    public TextLabel(int x, int y, String text) {
        txt = new JLabel(text);
        txt.setBounds(x, y, 800, 50);
        txt.setForeground(Color.black);
        txt.setFont(new Font("Serif", Font.PLAIN, 30));
    }

    public TextLabel(int x, int y, String text, int width, int height) {
        txt = new JLabel(text);
        txt.setBounds(x, y, width, height);
        txt.setForeground(Color.black);
        txt.setFont(new Font("Serif", Font.PLAIN, 30));
    }
}