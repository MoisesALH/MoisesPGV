package com.example.gestiontareas1;

import com.example.gestiontareas1.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class PantallaPrincipalController {
    @FXML
    private TableView<HelloApplication.Tarea> tablaTareas;

    @FXML
    private Button agregarButton;

    @FXML
    private Button historialButton;

    private Stage dialogStage;

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    // Agrega aquí los métodos y lógica necesarios para la vista principal
}
