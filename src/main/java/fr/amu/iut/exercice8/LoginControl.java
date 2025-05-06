package fr.amu.iut.exercice8;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class LoginControl extends GridPane {
    @FXML
    private TextField userId;
    @FXML
    private PasswordField pwd;
    @FXML
    private void okClicked() {
        String user = userId.getText();
        int len = pwd.getText() != null ? pwd.getText().length() : 0;

        // construits une suite de '*' de la bonne taille
        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < len; i++) {
            stars.append('*');
        }

        System.out.println(user + " " + stars);
    }
    @FXML
    private void cancelClicked() {
        userId.clear();
        pwd.clear();
    }
}