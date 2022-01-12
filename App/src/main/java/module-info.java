module java {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.desktop;

    opens Game to javafx.fxml;
    exports Game;

    opens Main to javafx.fxml;
    exports Main;
}