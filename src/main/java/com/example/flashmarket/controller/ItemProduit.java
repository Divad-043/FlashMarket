package com.example.flashmarket.controller;

import com.example.flashmarket.models.Produits;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;

public class ItemProduit {

    @FXML
    private HBox boxProduit;

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

    public void setData(Produits produit) throws SQLException {
        
        //InputStream image = produit.getImgProduit().getBinaryStream();
        Image image = new Image(getClass().getResourceAsStream(produit.getImgProduit()));
        Image img = new Image(getClass().getResourceAsStream(produit.getImgStar()));

        imgProduit.setImage(image);
        imgNoteStar.setImage(img);
        nameProduit.setText(produit.getNameProduit());
        describeProduit.setText(produit.getDescribeProduit());
        lblPrice.setText(String.valueOf(produit.getPriceProduit()));
        lblDevice.setText(produit.getDevice());
        lblEtat.setText(produit.getEtat());
    }
}
