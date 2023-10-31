module com.example.te10ud01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.te10ud01 to javafx.fxml;
    exports com.example.te10ud01;
}