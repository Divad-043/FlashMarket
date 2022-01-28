package com.example.flashmarket.controller;

import com.example.flashmarket.models.User;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UserController implements Initializable {

    @FXML
    private Label lblUsername;

    @FXML
    private TextField txtAge;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtLocation;

    @FXML
    private TextField txtNom;

    @FXML
    private TextField txtPrenom;

    @FXML
    private TextField txtSexe;

    @FXML
    private TextField txtTel;

    @FXML
    private Button button;

    User user;

    @FXML
    void clickImage(MouseEvent event) {

    }

    @FXML
    void btnClickOnModifier(ActionEvent event){

    }

    @FXML
    void btnClickOnQuitter(ActionEvent event){
        Platform.exit();
    }


    @FXML
    void utilisateur(ActionEvent event) throws IOException {

    }
    

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        userInformation();
    }

    private void userInformation() {
        user = new User();
        lblUsername.setText(user.getName());
        txtNom.setText(user.getName());
        txtPrenom.setText(user.getLastName());
        txtSexe.setText(user.getSexe());
        txtAge.setText("Non definie");
        txtEmail.setText(user.getEmail());
        txtTel.setText(user.getPhone());
        txtLocation.setText(user.getLocation());
    }
}
