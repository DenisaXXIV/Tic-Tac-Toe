package Game;

import Main.Main;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class GameController {
    int index = 0;
    int[][] matrix = {{0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}};
    String player1;
    String player2;

    @FXML
    private Pane GameView;

    @FXML
    private Button L0C0;

    @FXML
    private Button L0C1;

    @FXML
    private Button L0C2;

    @FXML
    private Button L1C0;

    @FXML
    private Button L1C1;

    @FXML
    private Button L1C2;

    @FXML
    private Button L2C0;

    @FXML
    private Button L2C1;

    @FXML
    private Button L2C2;

    @FXML
    private Button bSubmit;

    @FXML
    private Pane endView;

    @FXML
    private Pane entryView;

    @FXML
    private Button exit;

    @FXML
    private Label markType;

    @FXML
    private Label name;

    @FXML
    private TextField name1;

    @FXML
    private TextField name2;

    @FXML
    private Label nameEnd;

    @FXML
    private Button playAgain;

    @FXML
    private AnchorPane principalPane;

    @FXML
    void Again(MouseEvent event) {
    }

    @FXML
    void End(MouseEvent event) {
        Node node = (Node) event.getSource();
        Stage thisStage = (Stage) node.getScene().getWindow();
        thisStage.hide();
    }

    @FXML
    void MarkL0C0(MouseEvent event) {
        Xor0 mark = new Xor0(L0C0, markType, index, matrix, 0, 0, name, player1, player2);

        VerifyMatrix(matrix);

        index++;
    }

    @FXML
    void MarkL0C1(MouseEvent event) {
        Xor0 mark = new Xor0(L0C1, markType, index, matrix, 0, 1, name, player1, player2);

        VerifyMatrix(matrix);

        index++;
    }

    @FXML
    void MarkL0C2(MouseEvent event) {
        Xor0 mark = new Xor0(L0C2, markType, index, matrix, 0, 2, name, player1, player2);

        VerifyMatrix(matrix);

        index++;
    }

    @FXML
    void MarkL1C0(MouseEvent event) {
        Xor0 mark = new Xor0(L1C0, markType, index, matrix, 1, 0, name, player1, player2);

        VerifyMatrix(matrix);

        index++;
    }

    @FXML
    void MarkL1C1(MouseEvent event) {
        Xor0 mark = new Xor0(L1C1, markType, index, matrix, 1, 1, name, player1, player2);

        VerifyMatrix(matrix);

        index++;
    }

    @FXML
    void MarkL1C2(MouseEvent event) {
        Xor0 mark = new Xor0(L1C2, markType, index, matrix, 1, 2, name, player1, player2);

        VerifyMatrix(matrix);

        index++;
    }

    @FXML
    void MarkL2C0(MouseEvent event) {
        Xor0 mark = new Xor0(L2C0, markType, index, matrix, 2, 0, name, player1, player2);

        VerifyMatrix(matrix);

        index++;
    }

    @FXML
    void MarkL2C1(MouseEvent event) {
        Xor0 mark = new Xor0(L2C1, markType, index, matrix, 2, 1, name, player1, player2);

        VerifyMatrix(matrix);

        index++;
    }

    @FXML
    void MarkL2C2(MouseEvent event) {
        Xor0 mark = new Xor0(L2C2, markType, index, matrix, 2, 2, name, player1, player2);

        VerifyMatrix(matrix);

        index++;
    }

    @FXML
    void Submit(MouseEvent event) {
        player1 = name1.getText();
        player2 = name2.getText();
        name.setText(player1);
        playAgain.setVisible(false);
        entryView.setVisible(false);
        GameView.setVisible(true);
    }

    void VerifyMatrix(int[][] matrix) {
        boolean win = false;

        if (matrix[0][0] == matrix[0][1] && matrix[0][0] == matrix[0][2] && matrix[0][2] != 0) {
            win = true;
        } else if (matrix[1][0] == matrix[1][1] && matrix[1][0] == matrix[1][2] && matrix[1][2] != 0) {
            win = true;
        } else if (matrix[2][0] == matrix[2][1] && matrix[2][0] == matrix[2][2] && matrix[2][2] != 0) {
            win = true;
        } else if (matrix[0][0] == matrix[1][0] && matrix[0][0] == matrix[2][0] && matrix[1][0] != 0) {
            win = true;
        } else if (matrix[0][1] == matrix[1][1] && matrix[0][1] == matrix[2][1] && matrix[1][1] != 0) {
            win = true;
        } else if (matrix[0][2] == matrix[1][2] && matrix[0][2] == matrix[2][2] && matrix[0][2] != 0) {
            win = true;
        } else if (matrix[0][0] == matrix[1][1] && matrix[0][0] == matrix[2][2] && matrix[2][2] != 0) {
            win = true;
        } else if (matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0] && matrix[0][2] != 0) {
            win = true;
        }

        if (win == true) {
            if (index % 2 == 0) {
                nameEnd.setText(player1);
            } else {
                nameEnd.setText(player2);
            }
            GameView.setVisible(false);
            endView.setVisible(true);
        }
    }

}
