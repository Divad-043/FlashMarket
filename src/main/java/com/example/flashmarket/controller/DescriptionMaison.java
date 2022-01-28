package com.example.flashmarket.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DescriptionMaison implements Initializable {

    @FXML
    private Button btnRetour;

    @FXML
    private Button btnSoumettreProduit;

    @FXML
    private Button btnSoumettre;

    @FXML
    private TextField lblNbrChambre;

    @FXML
    private TextField lblNbrCuisine;

    @FXML
    private TextField lblNbrDouche;

    @FXML
    private TextField lblNbrLocalite;

    @FXML
    private TextField lblNbrSalon;

    @FXML
    private TextField lblNiveau;

    @FXML
    void btnSoumettreMaison(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void btnRetour(ActionEvent event) {
        Parent root;
        try {
            Stage stage = (Stage) btnRetour.getScene().getWindow();
            stage.close();

            root = FXMLLoader.load(getClass().getResource("/com/example/flashmarket/Accueil.fxml"));
            stage = new Stage();
            stage.setTitle("FlashMarket - Créeation produit");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void btnClickOnSoumettreProduit(ActionEvent event) {
        btnRetour(event);
    }
}
