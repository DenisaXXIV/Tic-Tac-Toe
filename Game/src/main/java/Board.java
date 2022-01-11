import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
    Board() {
        Image icon = Toolkit.getDefaultToolkit().getImage("src/main/resources/icon.png");
        setIconImage(icon);

        Box vBoxContent = Box.createVerticalBox();
        vBoxContent.setBackground(Color.WHITE);
        vBoxContent.setOpaque(true);

        Box hBoxName = Box.createHorizontalBox();
        hBoxName.add(new TextLabel(0,0,"Player: 1"));
        hBoxName.add(new TextLabel(0,50,"Mark: X"));
        vBoxContent.add(hBoxName);

        Box L1 = Box.createHorizontalBox();
        Marked marked=new Marked(0,60);
        L1.add(marked);
        L1.add(marked);
        L1.add(marked);
        vBoxContent.add(L1);

        Box L2 = Box.createHorizontalBox();
        L2.add(marked);
        L2.add(marked);
        L2.add(marked);
        vBoxContent.add(L2);

        Box L3 = Box.createHorizontalBox();
        L3.add(marked);
        L3.add(marked);
        L3.add(marked);
        vBoxContent.add(L3);

        add(vBoxContent);

        setSize(600, 700);
        setLayout(new FlowLayout());
        setLocation(500, 75);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
