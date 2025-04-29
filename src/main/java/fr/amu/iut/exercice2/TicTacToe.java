package tp1.exercice2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;

public class TicTacToe extends Application {
    private GridPane grille;

    @Override
    public void start(Stage fenetre) {

        grille = new GridPane();
        Random aleatoire = new Random();

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                Label cellule = new Label();
                cellule.setBorder(new Border(new BorderStroke(
                        Color.LIGHTGRAY,
                        BorderStrokeStyle.SOLID,
                        CornerRadii.EMPTY,
                        new BorderWidths(1)
                )));

                int tirage = aleatoire.nextInt(3);
                ImageView symbole;
                if (tirage == 1) {
                    symbole = new ImageView("exercice2/Rond.png");
                } else if (tirage == 2) {
                    symbole = new ImageView("exercice2/Croix.png");
                } else {
                    symbole = new ImageView("exercice2/Vide.png");
                }
                cellule.setGraphic(symbole);

                grille.add(cellule, x, y);
            }
        }

        Scene scene = new Scene(grille);

        fenetre.setTitle("Morpion");
        fenetre.setResizable(false);
        fenetre.setScene(scene);
        fenetre.show();
    }
}

