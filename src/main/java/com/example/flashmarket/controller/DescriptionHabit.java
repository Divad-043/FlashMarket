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

public class DescriptionHabit implements Initializable {

    @FXML
    private Button btnRetour;

    @FXML
    private Button btnSoumettreProduit;

    @FXML
    private ComboBox<String> comboType;

    @FXML
    private TextField lblCouleur;

    @FXML
    private TextField lblTaille;


    @FXML
    void btnSoumettre(ActionEvent event) {

    }

    @FXML
    void comboType(ActionEvent event) {

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> listType = FXCollections.observableArrayList("Chemise", "Pantallon", "Vest", "Ti-chort", "Mallo");
        comboType.setItems(listType);
    }
}
