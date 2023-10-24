package com.example.gestiontareas1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.util.Pair;
import javafx.geometry.Insets;
import javafx.scene.control.cell.PropertyValueFactory;
import java.time.LocalDate;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class HelloApplication extends Application {
    private TableView<Tarea> tablaTareas;
    private ObservableList<Tarea> listaTareas = FXCollections.observableArrayList();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Aplicación de Tareas");

        // Crear la tabla de tareas
        tablaTareas = new TableView<>();
        tablaTareas.setEditable(true);

        TableColumn<Tarea, String> nombreColumn = new TableColumn<>("Nombre");
        nombreColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        TableColumn<Tarea, LocalDate> fechaColumn = new TableColumn<>("Fecha");
        fechaColumn.setCellValueFactory(new PropertyValueFactory<>("fecha"));

        tablaTareas.getColumns().addAll(nombreColumn, fechaColumn);

        // Crear botones
        Button agregarButton = new Button("Agregar");
        Button historialButton = new Button("Historial");

        agregarButton.setOnAction(e -> mostrarDialogoAgregarTarea(primaryStage));
        historialButton.setOnAction(e -> mostrarHistorialTareas(primaryStage));

        // Crear el diseño de la aplicación
        HBox botonesLayout = new HBox(10);
        botonesLayout.getChildren().addAll(agregarButton, historialButton);

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(tablaTareas, botonesLayout);

        // Configurar la escena
        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);

        // Mostrar la ventana
        primaryStage.show();
    }

    private void mostrarDialogoAgregarTarea(Stage primaryStage) {
        Dialog<Pair<String, LocalDate>> dialog = new Dialog<>();
        dialog.initOwner(primaryStage);
        dialog.setTitle("Agregar Tarea");
        dialog.setHeaderText("Ingrese el nombre y la fecha de la tarea.");

        ButtonType agregarButtonType = new ButtonType("Agregar", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(agregarButtonType, ButtonType.CANCEL);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        TextField nombreField = new TextField();
        DatePicker fechaPicker = new DatePicker();

        grid.add(new Label("Nombre:"), 0, 0);
        grid.add(nombreField, 1, 0);
        grid.add(new Label("Fecha:"), 0, 1);
        grid.add(fechaPicker, 1, 1);

        dialog.getDialogPane().setContent(grid);

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == agregarButtonType) {
                return new Pair<>(nombreField.getText(), fechaPicker.getValue());
            }
            return null;
        });

        dialog.showAndWait().ifPresent(result -> {
            Tarea nuevaTarea = new Tarea(result.getKey(), result.getValue());
            listaTareas.add(nuevaTarea);
        });
    }

    private void mostrarHistorialTareas(Stage primaryStage) {
        Dialog<Void> dialog = new Dialog<>();
        dialog.initOwner(primaryStage);
        dialog.setTitle("Historial de Tareas");
        dialog.setHeaderText("Tareas con fecha posterior a hoy.");

        ButtonType closeButton = new ButtonType("Cerrar", ButtonBar.ButtonData.CANCEL_CLOSE);
        dialog.getDialogPane().getButtonTypes().addAll(closeButton);

        ListView<Tarea> historialListView = new ListView<>();
        for (Tarea tarea : listaTareas) {
            if (tarea.getFecha().isAfter(LocalDate.now())) {
                historialListView.getItems().add(tarea);
            }
        }

        dialog.getDialogPane().setContent(historialListView);

        dialog.showAndWait();
    }

    public class Tarea {
        private String nombre;
        private LocalDate fecha;

        public Tarea(String nombre, LocalDate fecha) {
            this.nombre = nombre;
            this.fecha = fecha;
        }

        public String getNombre() {
            return nombre;
        }

        public LocalDate getFecha() {
            return fecha;
        }
    }
}
