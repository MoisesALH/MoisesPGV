module com.example.vistatitsa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vistatitsa to javafx.fxml;
    exports com.example.vistatitsa;
}