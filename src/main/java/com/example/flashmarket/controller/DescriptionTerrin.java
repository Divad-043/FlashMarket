package com.example.flashmarket.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DescriptionTerrin {
    @FXML
    private Button btnRetour;

    @FXML
    private Button btnSoumettreProduit;


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
