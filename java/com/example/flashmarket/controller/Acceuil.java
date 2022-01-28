package com.example.flashmarket.controller;

import com.example.flashmarket.dbConnection.DBConnection;
import com.example.flashmarket.models.Produits;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class Acceuil implements Initializable {

    Connection connection = DBConnection.connecter();
    List<Produits> ajouterRecemment;
    List<Produits> dataList;
    private String strSQL;


    @FXML Button utilisateur;

    @FXML private HBox itemLayout;

    @FXML private GridPane produitContainer;

    @FXML private TextField textSearch;

    @FXML private Button buttonCreerProduit;

    @FXML private AnchorPane anchorPane;

    static int categorieser = 0;


    @FXML
    void buttonMouseCategorieTelephones(MouseEvent event) {
        System.out.println("Telephones");
        if(produitContainer.getChildren() == null) strSQL("SELECT * FROM ProduitsJ WHERE ProduitsJ.idCategorie=1");
        else {
            nettoyerGridPane();
            strSQL("SELECT * FROM ProduitsJ WHERE ProduitsJ.idCategorie=1");
        }
        categorieser = 1;
    }

    @FXML
    void buttonMouseCategorieOrdinateurs(MouseEvent event) {
        System.out.println("Ordinateurs");
        nettoyerGridPane();
        strSQL("SELECT * FROM ProduitsJ WHERE ProduitsJ.idCategorie=2");
        categorieser = 2;
    }

    @FXML
    void buttonMouseCategorieMaisons(MouseEvent event) {
        System.out.println("Maison");
        System.out.println("Ordinateurs");
        nettoyerGridPane();
        strSQL("SELECT * FROM ProduitsJ WHERE ProduitsJ.idCategorie=3");
        categorieser = 3;
    }

    @FXML
    void buttonMouseCategorieTerrin(MouseEvent event) {
        System.out.println("Ordinateurs");
        nettoyerGridPane();
        strSQL("SELECT * FROM ProduitsJ WHERE ProduitsJ.idCategorie=4");
        categorieser = 4;
    }

    @FXML
    void buttonMouseCategorieVetements(MouseEvent event) {
        System.out.println("Vetements");
        nettoyerGridPane();
        strSQL("SELECT * FROM ProduitsJ WHERE idProduit=5");
        categorieser = 5;
    }

    @FXML
    void buttonMouseCategorieFruits(MouseEvent event) {
        System.out.println("Fruits");
        nettoyerGridPane();
        strSQL("SELECT * FROM ProduitsJ WHERE idProduit=6");
        categorieser = 6;
    }

    @FXML
    void buttonMouseCategories(MouseEvent event) {
        System.out.println("Accuil");
        nettoyerGridPane();
        strSQL("SELECT * FROM ProduitsJ");
    }

    @FXML
    void creerProduit(ActionEvent event) {
        Parent root;
        try {
            Stage stage = (Stage) buttonCreerProduit.getScene().getWindow();
            stage.close();

            root = FXMLLoader.load(getClass().getResource("/com/example/flashmarket/AjoutProduit.fxml"));
            stage = new Stage();
            stage.setTitle("Créeation produit - FlashMarket");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void quitter(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void searchFocus(MouseEvent event) {
    }

    @FXML
    void utilisateur(MouseEvent event) throws IOException {
        AnchorPane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("/com/example/flashmarket/userData.fxml"));
        anchorPane.getChildrenUnmodifiable().setAll(pane);
    }

    private List<Produits> ajouterRecemment(){
        List<Produits> list = new ArrayList<>();

        Produits produit = new Produits();
        produit.setNameProduit("Iphone S");
        produit.setImgProduit("/com/example/flashmarket/images/phones/Phone1.png");
        produit.setImgStar("/com/example/flashmarket/images/evaluaton/5-star-icon.png");
        produit.setDescribeProduit("Iphone x recement acheté et aucun defaut");
        produit.setPriceProduit(230000);
        produit.setDevice("FCFA");
        produit.setEtat("Occasion");
        list.add(produit);


        produit = new Produits();
        produit.setNameProduit("Samsung S9");
       produit.setImgProduit("/com/example/flashmarket/images/phones/Phone2.png");
        produit.setImgStar("/com/example/flashmarket/images/evaluaton/5-star-icon.png");
        produit.setDescribeProduit("Samsung s9 recement acheté et aucun defaut");
        produit.setPriceProduit(230000);
        produit.setDevice("FCFA");
        produit.setEtat("Nouveau");
        list.add(produit);

        produit = new Produits();
        produit.setNameProduit("HP");
        produit.setImgProduit("/com/example/flashmarket/images/pc/pc1.png");
        produit.setImgStar("/com/example/flashmarket/images/evaluaton/5-star-icon.png");
        produit.setDescribeProduit("Un Ordinateur recement acheté et aucun defaut");
        produit.setPriceProduit(25000);
        produit.setDevice("FCFA");
        produit.setEtat("Occasion");
        list.add(produit);

        produit = new Produits();
        produit.setNameProduit("Azus");
        produit.setImgProduit("/com/example/flashmarket/images/pc/pc3.png");
        produit.setImgStar("/com/example/flashmarket/images/evaluaton/5-star-icon.png");
        produit.setDescribeProduit("Iphone x recement acheter et aucun defaut");
        produit.setPriceProduit(160000);
        produit.setDevice("FCFA");
        produit.setEtat("Nouveau");
        list.add(produit);

        produit = new Produits();
        produit.setNameProduit("Iphone S");
        produit.setImgProduit("/com/example/flashmarket/images/phones/Phone4.png");
        produit.setImgStar("/com/example/flashmarket/images/evaluaton/5-star-icon.png");
        produit.setDescribeProduit("Iphone x recement acheter et aucun defaut");
        produit.setPriceProduit(230000);
        produit.setDevice("FCFA");
        produit.setEtat("Occasion");
        list.add(produit);

        produit = new Produits();
        produit.setNameProduit("Iphone S");
        produit.setImgProduit("/com/example/flashmarket/images/phones/Phone2.png");
        produit.setImgStar("/com/example/flashmarket/images/evaluaton/5-star-icon.png");
        produit.setDescribeProduit("Iphone x recement acheter et aucun defaut");
        produit.setPriceProduit(230000);
        produit.setDevice("FCFA");
        produit.setEtat("Occasion");
        list.add(produit);

        return list;
    }

    private void nettoyerGridPane(){
        produitContainer.getChildren().clear();
    }

    List<Produits> dataList(Produits produit){
        List<Produits> listInfo = new ArrayList<>();

        switch (categorieser){

            case 1 : produit.setImgProduit("/com/example/flashmarket/images/phones/Phone2.png");
                break;
            case 2 : produit.setImgProduit("/com/example/flashmarket/images/pc/pc3.png");
                break;
            case 3 : produit.setImgProduit("/com/example/flashmarket/images/houses/House.png");
                break;
            case 4 : produit.setImgProduit("/com/example/flashmarket/images/lands/L1.jpg");
                break;
            case 5 : produit.setImgProduit("/com/example/flashmarket/images/vetements.png");
                break;
            case 6 : produit.setImgProduit("/com/example/flashmarket/images/grapes.png");
            default:
                for(int i = 0; i < 6; i++){
                    if(categorieser == i) produit.setImgProduit(tabImg(i));
                }
                break;
        }
        produit.setImgStar("/com/example/flashmarket/images/evaluaton/5-star-icon.png");
        produit.setDevice("FCFA");
        produit.setEtat("Occasion");
        listInfo.add(produit);

        return listInfo;
    }

    String[] tableau = new String[] {
            "/com/example/flashmarket/images/phones/Phone2.png",
            "/com/example/flashmarket/images/pc/pc3.png",
            "/com/example/flashmarket/images/houses/House.png",
            "/com/example/flashmarket/images/lands/L1.jpg",
            "/com/example/flashmarket/images/vetements.png",
            "/com/example/flashmarket/images/grapes.png"
    };
    private String tabImg(int position) {
        return tableau[position];
    }

    private void strSQL(String str){/*Quelques traitements*/ dataInit(str); }

    private void dataInit(String strRequest) {
        strSQL = strRequest;
        Produits produits;

        try(Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery( strSQL )){
                resultSet.next();

                int colonne = 0, ligne = 1;

                while ( resultSet.next() ){

                    produits = new Produits(resultSet.getString(2), resultSet.getFloat(3), resultSet.getString(4));
                    dataList = new ArrayList<>(dataList(produits));
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("/com/example/flashmarket/produits.fxml"));

                    VBox itemBox = fxmlLoader.load();
                    ProduitsController produitsController = fxmlLoader.getController();
                    produitsController.setData(produits);

                    if (colonne == 4){
                        colonne = 0;
                        ++ligne;
                    }
                    produitContainer.setAlignment(Pos.TOP_CENTER);
                    produitContainer.add(itemBox, colonne++, ligne);
                    GridPane.setMargin(itemBox, new Insets(10));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Initialisation en Cours..");
        ajouterRecemment = new ArrayList<>(ajouterRecemment());

        try {
            for (Produits produits : ajouterRecemment) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/com/example/flashmarket/itemProduit.fxml"));

                HBox itemBox = fxmlLoader.load();
                ItemProduit itemProduit = fxmlLoader.getController();
                itemProduit.setData(produits);
                itemLayout.getChildren().add(itemBox);
            }

        }catch (IOException | SQLException ioe){
            ioe.printStackTrace();
        }

        buttonMouseCategories(null);
    }
}
