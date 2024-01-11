package com.example.vistatitsa.controller;

import com.example.vistatitsa.model.Linea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class VistaController implements Initializable {
    @FXML
    private Button btnHome;

    @FXML
    private Button btnQr;

    @FXML
    private Button btnCuenta;

    @FXML
    private ListView lstLineas;

    private ArrayList<Linea> lineas;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lineas = new ArrayList<>();
        lineas.add(new Linea(10, "Santa Cruz", "Aereopuerto del sur"));
        lineas.add(new Linea(11, "La laguna", "El sauzal"));
        lineas.add( new Linea(12, "La laguna", "Los silos"));
        lineas.add( new Linea(14, "Santa Cruz", "La laguna"));
        lstLineas.getItems().addAll(lineas);
    }

    @Fxml
    private void irHome(ActionEvent e){

    }
}
