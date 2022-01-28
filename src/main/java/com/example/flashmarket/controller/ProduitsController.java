package com.example.flashmarket.controller;

import com.example.flashmarket.models.Produits;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ProduitsController {

    @FXML
    private Label describeProduit;

    @FXML
    private ImageView imgNoteStar;

    @FXML
    private ImageView imgProduit;

    @FXML
    private Label lblDevice;

    @FXML
    private Label lblEtat;

    @FXML
    private Label lblPrice;

    @FXML
    private Label nameProduit;

    public void setData(Produits produits){
        Image image = new Image(getClass().getResourceAsStream(produits.getImgProduit()));
        Image image1 = new Image(getClass().getResourceAsStream(produits.getImgStar()));

        imgProduit.setImage(image);
        imgNoteStar.setImage(image1);
        nameProduit.setText(produits.getNameProduit());
        describeProduit.setText(produits.getDescribeProduit());
        lblPrice.setText(String.valueOf(produits.getPriceProduit()));
        lblDevice.setText(produits.getDevice());
        lblEtat.setText(produits.getEtat());
    }
}
