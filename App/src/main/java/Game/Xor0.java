package Game;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class Xor0 {

    Xor0(Button button, Label markType, int index, int[][] matrix, int line, int column, Label name, String player1, String player2) {
        if (index % 2 == 0) {
            BackgroundImage backgroundImage = new BackgroundImage(new Image(getClass().getResource("/img/X.png").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(1, 1, true, true, false, false));
            Background background = new Background(backgroundImage);
            button.setBackground(background);
            markType.setText("0");
            name.setText(player2);
            matrix[line][column] = 1;

        } else {
            BackgroundImage backgroundImage = new BackgroundImage(new Image(getClass().getResource("/img/0.png").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(1, 1, true, true, false, false));
            Background background = new Background(backgroundImage);
            button.setBackground(background);
            markType.setText("X");
            name.setText(player1);
            matrix[line][column] = 2;
        }
    }
}
