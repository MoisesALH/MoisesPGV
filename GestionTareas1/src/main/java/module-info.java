module com.example.gestiontareas1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gestiontareas1 to javafx.fxml;
    exports com.example.gestiontareas1;
}