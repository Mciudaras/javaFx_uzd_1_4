package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Map;


public class Controller {
    @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;

    public void translateMet(ActionEvent event) {
        Map<String, String> nePetras = ReadFile.readFile();
        String lt = nePetras.get(textField.getText());
        if (lt != null && lt != "") {
            textArea.setText(lt);
        } else {
            for (String en : nePetras.keySet()) {
                if (nePetras.get(en).equals(textField.getText())) {
                textArea.setText(en);
                }
            }
        }
    }
}
