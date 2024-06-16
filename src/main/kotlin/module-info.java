module com.gabriel.sudoku20 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.gabriel.sudoku to javafx.fxml;
    exports com.gabriel.sudoku;
}