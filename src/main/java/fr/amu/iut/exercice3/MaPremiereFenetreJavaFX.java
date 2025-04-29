package fr.amu.iut.exercice3;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.event.EventHandler;
import javafx.event.Event;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MaPremiereFenetreJavaFX extends Application {

    private Label helloLabel;
    private TextField nameField;
    private Button button;

    // Gestionnaire d'évènements appelé lors du clic sur le bouton
    EventHandler<MouseEvent> buttonClickHandler = actionEvent -> {
        helloLabel.setText( "Bonjour à toi, "+nameField.getText() );
    };

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox();
        vbox.setAlignment( Pos.CENTER );

        // Création et ajout du label au conteneur
        Label helloLabel = new Label("Bonjour à tous !");
        vbox.getChildren().add( helloLabel );

        // Création de la scene
        Scene scene = new Scene( vbox );

        // Ajout de la scene à la fenêtre
        primaryStage.setScene( scene );
        primaryStage.setTitle("La page d'un Pro de JavaFX");
        primaryStage.setWidth(400);
        primaryStage.setHeight(400);
        primaryStage.show();

        TextField nameField = new TextField("Veuillez saisir un nom");
        nameField.setMaxWidth(180.0d);
        nameField.setFont( Font.font("Courier", FontWeight.NORMAL, 12) );
        vbox.getChildren().add( nameField );

        // Ajout d'un bouton avec du texte
        Button button = new Button("Dire bonjour");
        vbox.getChildren().add( button );

        Image image = new Image( MaPremiereFenetreJavaFX.class.getResource("silver_button.png").toString() );

        // Création d'un composant avec l'image peinte à l'intérieur
        ImageView iv = new ImageView();
        iv.setImage(image);

        // Intégration de l'image dans le bouton
        button.setGraphic( iv );

    }
    public class ButtonClickHandler implements EventHandler<Event> {

        private Label helloLabel;
        private TextField nameField;

        public ButtonClickHandler(Label helloLabel, TextField nameField) {
            this.helloLabel = helloLabel;
            this.nameField = nameField;
        }

        @Override
        public void handle(Event event) {
            // Utiliser le Label récupéré
            helloLabel.setText( "Bonjour à toi, "+nameField.getText() );
        }

    }
}

