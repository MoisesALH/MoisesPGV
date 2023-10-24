package ies.puertodelacruz.mlh.hilosej1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication{
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Thread consumidor = new Thread(new Consumidor(buffer));
        Thread productor = new Thread(new Productor(buffer));

        productor.start();
        consumidor.start();
    }
}