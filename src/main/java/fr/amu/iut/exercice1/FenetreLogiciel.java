package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {
        // code de  l'exercice 1
        BorderPane root = new BorderPane();
        //Barre de menus
        MenuBar MenuBar = new MenuBar();
        Menu File = new Menu("File");
        MenuItem New = new MenuItem("New");
        MenuItem Open = new MenuItem("Open");
        MenuItem Save = new MenuItem("Save");
        MenuItem Close = new MenuItem("Close");
        Menu Edit = new Menu("Edit");
        MenuItem Cut = new MenuItem("Cut");
        MenuItem Copy = new MenuItem("Copy");
        MenuItem Paste = new MenuItem("Paste");
        Menu Help = new Menu("Help");
        File.getItems().addAll(New, Open, Save, Close);
        Edit.getItems().addAll(Cut, Copy, Paste);
        MenuBar.getMenus().addAll(File, Edit, Help);
        root.setTop(MenuBar);

        VBox vBox = new VBox();
        Label Boutons = new Label("Boutons :");
        Button Bouton1 = new Button("Bouton 1");
        Button Bouton2 = new Button("Bouton 2");
        Button Bouton3 = new Button("Bouton 3");
        vBox.getChildren().addAll(Boutons,Bouton1,Bouton2,Bouton3);
        vBox.setAlignment(Pos.CENTER);
        root.setCenter(vBox);

        Scene scene = new Scene(root, 500, 500);
        //Ici, on définit la scène principale de l'appli
        primaryStage.setScene(scene);
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


