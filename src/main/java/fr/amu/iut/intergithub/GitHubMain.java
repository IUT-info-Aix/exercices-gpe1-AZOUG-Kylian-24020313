package fr.amu.iut.intergithub;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GitHubMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Charge la vue FXML depuis resources/intergithub/GitHubView.fxml
        BorderPane root = FXMLLoader.load(
                getClass().getResource("/intergithub/GitHubView.fxml")
        );
        // Crée la scène et applique le CSS
        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(
                getClass().getResource("/intergithub/GitHub.css").toExternalForm()
        );

        primaryStage.setTitle("GitHub Clone");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}