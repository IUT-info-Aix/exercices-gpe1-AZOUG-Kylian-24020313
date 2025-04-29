package fr.amu.iut.exercice4;

import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.animation.KeyFrame;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Palette extends Application {


    private int compteurVert = 0;
    private int compteurRouge = 0;
    private int compteurBleu = 0;

    private Pane zoneCouleur;
    private Label affichage;
    private Button boutonVert;
    private Button boutonRouge;
    private Button boutonBleu;

    @Override
    public void start(Stage primaryStage) throws Exception {
        zoneCouleur = new Pane();
        zoneCouleur.setStyle("-fx-background-color: rgb(0,0,0);");
        zoneCouleur.setPrefHeight(120);

        // Label en haut
        affichage = new Label("Cliquez sur un bouton pour changer la couleur");
        HBox zoneTexte = new HBox(affichage);
        zoneTexte.setAlignment(Pos.CENTER);
        zoneTexte.setStyle("-fx-padding: 10px;");

        // Boutons
        boutonVert = new Button("Vert");
        boutonRouge = new Button("Rouge");
        boutonBleu = new Button("Bleu");

        boutonVert.setOnAction(e -> miseAJourCouleur("vert"));
        boutonRouge.setOnAction(e -> miseAJourCouleur("rouge"));
        boutonBleu.setOnAction(e -> miseAJourCouleur("bleu"));

        HBox zoneBoutons = new HBox(10, boutonRouge, boutonVert, boutonBleu);
        zoneBoutons.setAlignment(Pos.CENTER);
        zoneBoutons.setStyle("-fx-padding: 10px;");

        // Placement global
        BorderPane root = new BorderPane();
        root.setTop(zoneTexte);
        root.setCenter(zoneCouleur);
        root.setBottom(zoneBoutons);

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setTitle("Mélange de couleurs");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    private void miseAJourCouleur(String couleur) {
        if (couleur.equals("vert")) compteurVert++;
        else if (couleur.equals("rouge")) compteurRouge++;
        else if (couleur.equals("bleu")) compteurBleu++;

        int r = Math.min(compteurRouge * 40, 255);
        int g = Math.min(compteurVert * 40, 255);
        int b = Math.min(compteurBleu * 40, 255);

        zoneCouleur.setStyle("-fx-background-color: rgb(" + r + "," + g + "," + b + ");");

        affichage.setText(String.format("Rouge: %d | Vert: %d | Bleu: %d", compteurRouge, compteurVert, compteurBleu));
    }

    public static void main(String[] args) {
        launch(args);
    }
}

