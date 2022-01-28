package com.example.flashmarket.controller;

import com.example.flashmarket.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import com.example.flashmarket.Main;
import com.example.flashmarket.MyListener;
import com.example.flashmarket.models.Fruit;

import java.util.Objects;

public class ItemController {


    @FXML
    private Label nameLabel;

    @FXML
    private Label priceLable;

    @FXML
    private ImageView img;

    @FXML
    private void click(MouseEvent mouseEvent) {
        myListener.onClickListener(fruit);
    }

    private Fruit fruit;
    private Fruit phone;
    private MyListener myListener;

    public void setData(Fruit fruit, MyListener myListener) {
        this.fruit = fruit;
        this.myListener = myListener;
        nameLabel.setText(fruit.getName());
        priceLable.setText(Main.CURRENCY + fruit.getPrice());
        Image image = new Image(HelloApplication.class.getResource("images/"+fruit.getImgSrc()).toExternalForm());
        //System.out.println(fruit.getImgSrc());
        img.setImage(image);
    }

    public void setDataPhone(Fruit phone, MyListener myListener) {
        this.phone = phone;
        this.myListener = myListener;
        nameLabel.setText(phone.getName());
        priceLable.setText(Main.CURRENCY + phone.getPrice());
        Image image = new Image(HelloApplication.class.getResource("images/"+phone.getImgSrc()).toExternalForm());
        //System.out.println(fruit.getImgSrc());
        img.setImage(image);
    }
}
