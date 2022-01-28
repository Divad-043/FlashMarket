package com.example.flashmarket.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class DescriptionHabit implements Initializable {

    @FXML
    private Button btnRetour;

    @FXML
    private Button btnSoumettre;

    @FXML
    private ComboBox<String> comboType;

    @FXML
    private TextField lblCouleur;

    @FXML
    private TextField lblTaille;

    @FXML
    void btnRetour(ActionEvent event) {

    }

    @FXML
    void btnSoumettre(ActionEvent event) {

    }

    @FXML
    void comboType(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> listType = FXCollections.observableArrayList("Chemise", "Pantallon", "Vest", "Ti-chort", "Mallo");
        comboType.setItems(listType);
    }
}
