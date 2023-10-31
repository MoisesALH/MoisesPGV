package es.iespuertodelacruz.mlh.te9ud01;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class TextAppController {

    @FXML
    private TextArea textArea;
    @FXML
    private TextField textField;
    @FXML
    private MenuItem abrirMenuItem;
    @FXML
    private MenuItem guardarMenuItem;

    public void initialize() {
        abrirMenuItem.setOnAction(e -> abrirArchivo());
        guardarMenuItem.setOnAction(e -> guardarArchivo());
    }

    @FXML
    private void enviarTexto() {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
    }

    private void abrirArchivo() {
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {
            try {
                String content = new String(Files.readAllBytes(selectedFile.toPath()));
                textField.setText(content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void guardarArchivo() {
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showSaveDialog(null);

        if (file != null) {
            try {
                Files.write(file.toPath(), textField.getText().getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

