module com.example.assignment_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment_1 to javafx.fxml;
    exports com.example.assignment_1;
}