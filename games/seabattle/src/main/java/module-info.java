module tictactoe {
    requires javafx.fxml;
    requires javafx.controls;
    opens ru.tic to javafx.fxml;
    exports ru.tic;
}