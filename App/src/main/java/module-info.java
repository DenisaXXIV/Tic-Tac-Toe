module com.tictactoe.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.desktop;

    opens com.tictactoe.tictactoe to javafx.fxml;
    exports;
    opens to
}