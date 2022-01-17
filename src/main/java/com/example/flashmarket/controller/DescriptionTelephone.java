package com.example.flashmarket.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class DescriptionTelephone implements Initializable {

    @FXML
    private ComboBox<?> etat;

    @FXML
    private TextField marque;

    @FXML
    private TextField ram;

    @FXML
    private TextField stokage;

    @FXML
    void btnRetour(ActionEvent event) {

    }

    @FXML
    void selectEtat(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
