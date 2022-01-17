package com.example.flashmarket.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class ResultatSearch implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private ImageView cursorSearch;

    @FXML
    private TextField valSearch;

    @FXML
    private Label produitName;

    @FXML
    private Label produitPrice;

    @FXML
    private Label produitDescribe;

    @FXML
    private Label produitStatus;

    @FXML
    private Label produitEvaluation;


    public void chercher(ActionEvent actionEvent) {

        TextField recherche = valSearch;
    }
}
