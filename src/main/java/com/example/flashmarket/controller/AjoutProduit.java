package com.example.flashmarket.controller;

import com.example.flashmarket.dbConnection.DBConnection;
import com.example.flashmarket.models.Produits;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;
import java.util.ResourceBundle;

public class AjoutProduit implements Initializable {

    @FXML
    private AnchorPane registrePane;

    @FXML
    private Button btnInfoSuivant;

    @FXML
    private Button btnSoumettreProduit;

    @FXML
    private ComboBox<String> comboCategorie;

    @FXML
    private ComboBox<String> comboDevise;

    @FXML
    private TextArea produitDescribe;

    @FXML
    private TextField produitName;

    @FXML
    private ImageView photoNameP;

    @FXML
    private TextField produitPrice;

    String nom, descripton, categorie, device;
    int idUser = (int) (Math.random()*4) + 1, idCategorie;
    float prix;

    void btnClickOnSoumettreProduit() throws SQLException {

        nom = produitName.getText();
        descripton = produitDescribe.getText();
        categorie = selectCategorie(null);
        prix = Float.parseFloat(produitPrice.getText());
        if(comboDevise.getValue() == null) device = "FCFA";
        else
            device = (String) comboDevise.getValue();


        System.out.println(nom+", "+ descripton+","+categorie+"," +prix+"," +device+","+idCategorie+","+idUser);
        int statusReponse = enregistrerInformationProduit(nom, prix, descripton, idUser,idCategorie );
        System.out.println("Reponse : "+ statusReponse);
        if(statusReponse > 0){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Ajout de produit !");
            alert.setHeaderText("Information");
            alert.setContentText("Le produit est bien ajouté");
            alert.showAndWait();
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ajout de produit !");
            alert.setHeaderText("Informaton");
            alert.setContentText("Produit non ajouté, Une ERREUR est survenue l'or du soumission");
            alert.showAndWait();
        }
    }

    private int enregistrerInformationProduit(String nom, float prix, String descripton, int user, int categorie) throws SQLException {
        Connection connection = DBConnection.connecter();
        int status = 0;
        if(DBConnection.succsess){
            String strSQL = "INSERT INTO ProduitsJ(nomProduit, prixProduit, descriptionProduit, idUser, idCategorie) VALUES(?,?,?,?,?)";
            PreparedStatement statement;
            statement = connection.prepareStatement(strSQL);
            statement.setString(2, nom);
            statement.setFloat(3, prix);
            statement.setString(4, descripton);
            statement.setInt(5, user);
            statement.setInt(6, idCategorie);
            status = statement.executeUpdate();

            connection.close();
        }
        return status;
    }

    @FXML
    void infoSuivant(ActionEvent event) throws IOException, SQLException {
        String categorie = selectCategorie(event);

        switch (categorie) {

            case "Téléphone" : lancerDescriptionTel(event);
                idCategorie = 1;
                break;

            case "Ordinateur" : lancerDescriptionOrdinateur(event);
                idCategorie = 2;
                break;

            case "Maison" : lancerDescriptionMaison(event);
                idCategorie = 3;
                break;

            case "Terrin" : lancerDescriptionTerrin(event);
                idCategorie = 4;
                break;

            case "Habit" : lancerDescriptionHabit(event);
                idCategorie = 5;
                break;

            case "Fruit" : lancerDescriptionFruit(event);
                idCategorie = 6;
            default:
            break;
        }

        btnClickOnSoumettreProduit();
    }

    @FXML
    public void lancerDescriptionTel(ActionEvent event) throws IOException {
        Parent root;
        try {
            Stage stage = (Stage) btnInfoSuivant.getScene().getWindow();
            stage.close();

            root = FXMLLoader.load(getClass().getResource("/com/example/flashmarket/descriptionTelephone.fxml"));
            stage = new Stage();
            stage.setTitle("Ajout de Téléphones - FlashMarket");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void lancerDescriptionOrdinateur(ActionEvent event) throws IOException {
        Parent root;
        try {
            Stage stage = (Stage) btnInfoSuivant.getScene().getWindow();
            stage.close();

            root = FXMLLoader.load(getClass().getResource("/com/example/flashmarket/descriptionOrdinateur.fxml"));
            stage = new Stage();
            stage.setTitle("Ajout de Ordinateur - FlashMarket");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void lancerDescriptionMaison(ActionEvent event) throws IOException {
        Parent root;
        try {
            Stage stage = (Stage) btnInfoSuivant.getScene().getWindow();
            stage.close();

            root = FXMLLoader.load(getClass().getResource("/com/example/flashmarket/descriptionMaison.fxml"));
            stage = new Stage();
            stage.setTitle("Ajout de Maison - FlashMarket");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void lancerDescriptionHabit(ActionEvent event) throws IOException {
        Parent root;
        try {
            Stage stage = (Stage) btnInfoSuivant.getScene().getWindow();
            stage.close();

            root = FXMLLoader.load(getClass().getResource("/com/example/flashmarket/descriptionHabit.fxml"));
            stage = new Stage();
            stage.setTitle("Ajout de Vếtements - FlashMarket");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void lancerDescriptionFruit(ActionEvent event) throws IOException {
        Parent root;
        try {
            Stage stage = (Stage) btnInfoSuivant.getScene().getWindow();
            stage.close();

            root = FXMLLoader.load(getClass().getResource("/com/example/flashmarket/descriptionFruit.fxml"));
            stage = new Stage();
            stage.setTitle("Ajout de fruits - FlashMarket");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @FXML
    public void lancerDescriptionTerrin(ActionEvent event) throws IOException {

        AnchorPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("" +
                "/com/example/flashmarket/descriptionTerrin.fxml")));

        registrePane.getChildren().setAll(pane);
    }

    @FXML
    String selectCategorie(ActionEvent event){
        String choixCategorie = (String) comboCategorie.getValue();
        if(choixCategorie == null) choixCategorie = "Téléphones";
        return choixCategorie;
    }


    @FXML
    void selectDevice(ActionEvent event) {
        String device = (String) comboDevise.getValue();
    }

    @FXML
    void annuler(ActionEvent event) {
        produitName.clear();
        produitPrice.clear();
        produitDescribe.clear();
        comboCategorie.setValue(null);
        comboDevise.setValue(null);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ObservableList<String> listDevice = FXCollections.observableArrayList("Dollar", "Euros", "FCFA");
        comboDevise.setItems(listDevice);

        ObservableList<String> listCategorie = FXCollections.observableArrayList("T\u00E9l\u00E9phone",
                "Ordinateur", "Maison", "Terrin", "Habit", "Fruit");
        comboCategorie.setItems(listCategorie);
    }
}
