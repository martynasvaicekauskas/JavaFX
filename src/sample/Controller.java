package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label text; // visada pasirinkti Java.fx
    @FXML
    private TextField textField;
    @FXML
    private TextField textField2;

    public void sayHi(ActionEvent event){ // visada pasirinkti Java.fx
       text.setText(textField.getText() + "" + textField2.getText());



    }


}

