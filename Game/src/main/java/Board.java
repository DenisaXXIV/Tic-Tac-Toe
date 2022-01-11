import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
    Board() {
        //JPanel pabel = new JPanel(new GridLayout(3,2));

        GridLayout board = new GridLayout(4,3);
        Image icon = Toolkit.getDefaultToolkit().getImage("src/main/resources/icon.png");
        setIconImage(icon);

        Box hBoxName = Box.createHorizontalBox();
        hBoxName.add(new TextLabel(0,0,"Player: 1"));
        hBoxName.add(new TextLabel(0,50,"Mark: X"));
        hBoxName.setBackground(Color.WHITE);
        hBoxName.setOpaque(true);
        add(hBoxName);

        Box L1 = Box.createHorizontalBox();
        L1.setBackground(Color.green);
        Marked marked=new Marked();
        L1.add(marked);
        L1.add(marked);
        L1.add(marked);
        add(L1);

        Box L2 = Box.createHorizontalBox();
        L2.setBackground(Color.pink);
        L2.add(marked);
        L2.add(marked);
        L2.add(marked);
        add(L2);

        Box L3 = Box.createHorizontalBox();
        L3.setBackground(Color.blue);
        L3.add(marked);
        L3.add(marked);
        L3.add(marked);
        add(L3);


        //setBorder(BorderFactory.createEmptyBorder(2,2,2,2));


        setSize(600, 700);
        setLayout(board);
        setLocation(500, 75);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
