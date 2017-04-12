package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label text; // visada pasirinkti Java.fx

    public void sayHi(ActionEvent event){ // visada pasirinkti Java.fx
        String prefix= text.getText();
        text.setText(prefix + " Andrius");



    }


}

