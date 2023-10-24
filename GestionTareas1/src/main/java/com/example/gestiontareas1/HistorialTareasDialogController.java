package com.example.gestiontareas1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.collections.ObservableList;

public class HistorialTareasDialogController {
    @FXML
    private ListView<HelloApplication.Tarea> historialListView;

    @FXML
    private Button cerrarButton;

    private Stage dialogStage;

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    // Agrega aquí los métodos y lógica necesarios para el diálogo de historial de tareas
}
