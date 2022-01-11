import javax.swing.*;
import java.awt.*;

public class Marked extends JButton {
    Marked(int x, int y){
        setBounds(x, y, 200, 200);
        setBackground(Color.GREEN);
    }

    Marked(){
        setPreferredSize(new Dimension(200,200));
        setBackground(Color.GREEN);
    }

    Marked(int x,int y, int player){
        if(player==1) {
            setBounds(x, y, 200, 200);
            setBackground(Color.BLACK);
            setFont(new Font("Times New Roman",Font.PLAIN,50));
            setText("X");
        }
        else if(player == 2){
            setBounds(x, y, 200, 200);
            setBackground(Color.BLACK);
            setFont(new Font("Times New Roman",Font.PLAIN,50));
            setText("0");
        }
        else {
            setBounds(x, y, 200, 200);
            setBackground(Color.GREEN);
        }
    }
}
