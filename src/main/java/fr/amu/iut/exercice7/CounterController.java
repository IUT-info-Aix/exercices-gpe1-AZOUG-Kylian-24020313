package fr.amu.iut.exercice7;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Label;
public class CounterController implements Initializable {
    @FXML
    private Label counterLabel;
    int counter = 0;
    @FXML
    private void initialize() {
        counterLabel.setText(String.valueOf(counter));
    }
    public void increment() {
        counter++;
        counterLabel.setText(String.valueOf(counter));
    }

    public void decrement() {
        counter--;
        counterLabel.setText(String.valueOf(counter));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Initializing CounterController...");
   }
}
