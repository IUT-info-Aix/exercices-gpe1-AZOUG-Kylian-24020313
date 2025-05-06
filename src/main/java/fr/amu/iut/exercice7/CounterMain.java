package fr.amu.iut.exercice7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class CounterMain extends Application {

    @Override
    public void start(Stage stage) throws Exception {
            BorderPane root = FXMLLoader.load(getClass().getClassLoader().getResource("exercice7/CounterView.fxml"));
            stage.setTitle("Compteur simple");
            stage.setScene(new Scene(root, 300, 200));
            stage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }