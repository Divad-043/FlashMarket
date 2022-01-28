package com.example.flashmarket.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DescriptionOrdinateur implements Initializable {

    @FXML
    private Button btnRetour;

    @FXML
    private Button btnSoumettreProduit;

    @FXML
    private ComboBox<String> comboEtatOrd;

    @FXML
    private TextField marqueOrd;

    @FXML
    private TextField ramOrd;

    @FXML
    private TextField stokageOrd;


    @FXML
    void selectEtatOrd(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> listEtats = FXCollections.observableArrayList("Occasion", "Neuf");
        comboEtatOrd.setItems(listEtats);
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
