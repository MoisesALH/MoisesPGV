package com.example.gestiontareas1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.time.LocalDate;

public class AgregarTareaDialogController {
    @FXML
    private TextField nombreField;

    @FXML
    private DatePicker fechaPicker;

    @FXML
    private Button agregarButton;

    @FXML
    private Button cancelarButton;

    private Stage dialogStage;

    private Pair<String, LocalDate> tareaAgregada;

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public Pair<String, LocalDate> getTareaAgregada() {
        return tareaAgregada;
    }

    // Agrega aquí los métodos y lógica necesarios para el diálogo de agregar tarea
}
