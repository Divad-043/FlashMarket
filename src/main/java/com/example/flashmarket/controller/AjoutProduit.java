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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class AjoutProduit implements Initializable {

    @FXML
    private AnchorPane registrePane;

    @FXML
    private ComboBox<?> comboCategorie;

    @FXML
    private ComboBox<String> comboDevise;

    @FXML
    private TextArea describeP;

    @FXML
    private TextField nameP;

    @FXML
    private ImageView photoNameP;

    @FXML
    private TextField priceP;

    @FXML
    private Button suivantInfo;

    @FXML
    public void lancerDescriptionTel(ActionEvent event) throws IOException {

        AnchorPane pane = FXMLLoader.load(getClass().getResource("" +
                "/com/example/flashmarket/vue/descriptionTelephone.fxml"));

        registrePane.getChildren().setAll(pane);
    }

    @FXML
    public void lancerDescriptionOrdinateur(ActionEvent event) throws IOException {

        AnchorPane pane = FXMLLoader.load(getClass().getResource("" +
                "/com/example/flashmarket/vue/descriptionOrdinateur.fxml"));

        registrePane.getChildren().setAll(pane);
    }

    @FXML
    public void lancerDescriptionMaison(ActionEvent event) throws IOException {

        AnchorPane pane = FXMLLoader.load(getClass().getResource("" +
                "/com/example/flashmarket/vue/descriptionMaison.fxml"));

        registrePane.getChildren().setAll(pane);
    }

    @FXML
    public void lancerDescriptionHabit(ActionEvent event) throws IOException {

        AnchorPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("" +
                "/com/example/flashmarket/vue/descriptionHabit.fxml")));

        registrePane.getChildren().setAll(pane);
    }

    @FXML
    public void lancerDescriptionFruit(ActionEvent event) throws IOException {

        AnchorPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("" +
                "/com/example/flashmarket/vue/descriptionFruit.fxml")));

        registrePane.getChildren().setAll(pane);
    }



    @FXML
    public void lancerDescriptionTerrin(ActionEvent event) throws IOException {

        AnchorPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("" +
                "/com/example/flashmarket/vue/descriptionTerrin.fxml")));

        registrePane.getChildren().setAll(pane);
    }

    @FXML
    void suivant(ActionEvent event) throws IOException {
        //Parent infosParent = FXMLLoader.load(getClass().getResource("/com/example/flashmarket/vue/descriptionTelephone.fxml"));
        //Scene infoSuivantScene = new Scene(infosParent);

        selectCategorie(null);
    }

    @FXML
    void selectCategorie(ActionEvent event) throws IOException {
        String choixCategorie = comboCategorie.getSelectionModel().toString();

        lancerVue(choixCategorie);
    }

    private void lancerVue(String choixCategorie) throws IOException {
        switch (choixCategorie) {

            case "Téléphone" : lancerDescriptionTel(null);
            break;

            case "Ordinateur" : lancerDescriptionOrdinateur(null);
            break;

            case "Maison" : lancerDescriptionMaison(null);
            break;

            case "Terrin" : lancerDescriptionTerrin(null);
            break;

            case "Habit" : lancerDescriptionHabit(null);
            break;

            case "Fruit" : lancerDescriptionFruit(null);
        }
    }

    @FXML
    void selectDevice(ActionEvent event) {
        String device = comboDevise.getSelectionModel().toString();
    }

    @FXML
    void annuler(ActionEvent event) {
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ObservableList<String> listDevice = FXCollections.observableArrayList("Dollar", "Euros", "FCFA");
        comboDevise.setItems(listDevice);

        ObservableList<String> listCategorie = FXCollections.observableArrayList("T\u00E9l\u00E9phone",
                "Ordinateur", "Maison", "Terrin", "Habit", "Fruit");
    }
}
