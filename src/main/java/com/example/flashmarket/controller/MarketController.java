package com.example.flashmarket.controller;

import com.example.flashmarket.HelloApplication;
import com.example.flashmarket.Main;
import com.example.flashmarket.MyListener;
import com.example.flashmarket.controller.ItemController;
import com.example.flashmarket.models.Phone;
import com.example.flashmarket.models.Produit;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import com.example.flashmarket.models.Fruit;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MarketController implements Initializable {
    @FXML
    private VBox chosenFruitCard;

    @FXML
    private Label fruitNameLable;

    @FXML
    private Label fruitPriceLabel;

    @FXML
    private ImageView fruitImg;

    @FXML
    private ScrollPane scroll;

    @FXML
    private GridPane grid;

//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//
//    }

    private List<Fruit> fruits = new ArrayList<>();
    private List<Fruit> phones = new ArrayList<>();
    private Image image;
    private MyListener myListener;

    private List<Fruit> getData() {
        List<Fruit> fruits = new ArrayList<>();
        Fruit fruit;

        fruit = new Fruit();
        fruit.setName("Kiwi");
        fruit.setPrice(2.99);
        fruit.setImgSrc("kiwi.png");
        fruit.setColor("6A7324");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Coconut");
        fruit.setPrice(3.99);
        fruit.setImgSrc("coconut.png");
        fruit.setColor("A7745B");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Peach");
        fruit.setPrice(1.50);
        fruit.setImgSrc("peach.png");
        fruit.setColor("F16C31");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Grapes");
        fruit.setPrice(0.99);
        fruit.setImgSrc("grapes.png");
        fruit.setColor("291D36");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Watermelon");
        fruit.setPrice(4.99);
        fruit.setImgSrc("watermelon.png");
        fruit.setColor("22371D");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Orange");
        fruit.setPrice(2.99);
        fruit.setImgSrc("orange.png");
        fruit.setColor("FB5D03");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("StrawBerry");
        fruit.setPrice(0.99);
        fruit.setImgSrc("strawberry.png");
        fruit.setColor("80080C");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Mango");
        fruit.setPrice(0.99);
        fruit.setImgSrc("mango.png");
        fruit.setColor("FFB605");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Cherry");
        fruit.setPrice(0.99);
        fruit.setImgSrc("cherry.png");
        fruit.setColor("5F060E");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Banana");
        fruit.setPrice(1.99);
        fruit.setImgSrc("banana.png");
        fruit.setColor("E7C00F");
        fruits.add(fruit);

        return fruits;
    }

    private List<Fruit> getDataPhone() {
        List<Fruit> phones = new ArrayList<>();
        Fruit phone;



        phone = new Fruit();
        phone.setName("Phone1");
        phone.setPrice(15);
        phone.setImgSrc("cell-phone.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone2");
        phone.setPrice(0.99);
        phone.setImgSrc("cell-phone.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone1");
        phone.setPrice(15);
        phone.setImgSrc("cell-phone.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone2");
        phone.setPrice(0.99);
        phone.setImgSrc("cell-phone.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone1");
        phone.setPrice(15);
        phone.setImgSrc("cell-phone.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone2");
        phone.setPrice(0.99);
        phone.setImgSrc("cell-phone.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone1");
        phone.setPrice(15);
        phone.setImgSrc("cell-phone.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone2");
        phone.setPrice(0.99);
        phone.setImgSrc("cell-phone.jpg");
        phone.setColor("5F060E");
        phones.add(phone);
        phone = new Fruit();
        phone.setName("Phone1");
        phone.setPrice(15);
        phone.setImgSrc("cell-phone.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone2");
        phone.setPrice(0.99);
        phone.setImgSrc("cell-phone.jpg");
        phone.setColor("5F060E");
        phones.add(phone);
        phone = new Fruit();
        phone.setName("Phone1");
        phone.setPrice(15);
        phone.setImgSrc("cell-phone.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone2");
        phone.setPrice(0.99);
        phone.setImgSrc("cell-phone.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        return phones;
    }

    private void setChosenFruit(Produit fruit) {
        fruitNameLable.setText(fruit.getName());
        fruitPriceLabel.setText(Main.CURRENCY + fruit.getPrice());
        image = new Image(HelloApplication.class.getResource("images/"+fruit.getImgSrc()).toExternalForm());
//        image = new Image(getClass().getResource(fruit.getImgSrc()).toString());
        fruitImg.setImage(image);
        chosenFruitCard.setStyle("-fx-background-color: #" + fruit.getColor() + ";\n" +
                "    -fx-background-radius: 30;");
    }

    private void setChosenPhone(Fruit phone) {
        System.out.println(phone.getName());
        fruitNameLable.setText(phone.getName());
        fruitPriceLabel.setText(Main.CURRENCY + phone.getPrice());
        image = new Image(HelloApplication.class.getResource("images/"+phone.getImgSrc()).toExternalForm());
//        image = new Image(getClass().getResource(fruit.getImgSrc()).toString());
        fruitImg.setImage(image);
        chosenFruitCard.setStyle("-fx-background-color: #" + phone.getColor() + ";\n" +
                "    -fx-background-radius: 30;");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        phones.addAll(getDataPhone());
        fruits.addAll(getData());
//        fruits.addAll(getData());
//        if (fruits.size() > 0) {
//            setChosenFruit(fruits.get(0));
//            myListener = new MyListener() {
//                @Override
//                public void onClickListener(Object fruit) {
//                    setChosenFruit((Fruit) fruit);
//                }
//            };
        myListener = new MyListener() {
            @Override
            public void onClickListener(Produit fruit) {
                setChosenFruit( fruit);
            }
        };
//        }
        int column = 0;
        int row = 1;
//        try {
//            for (int i = 0; i < fruits.size(); i++) {
//                FXMLLoader fxmlLoader = new FXMLLoader();
//                fxmlLoader.setLocation(HelloApplication.class.getResource("item.fxml"));
//                AnchorPane anchorPane = fxmlLoader.load();
//
//                ItemController itemController = fxmlLoader.getController();
//                itemController.setData(fruits.get(i),myListener);
//
//                if (column == 5) {
//                    column = 0;
//                    row++;
//                }
//
//                grid.add(anchorPane, column++, row); //(child,column,row)
//                //set grid width
//                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
//                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
//                grid.setMaxWidth(Region.USE_PREF_SIZE);
////
//                //set grid height
//                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
//                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
//                grid.setMaxHeight(Region.USE_PREF_SIZE);
//
//                GridPane.setMargin(anchorPane, new Insets(8));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//            //System.out.println(e.getMessage());
//        }
    }

    public void phoneCategory(MouseEvent mouseEvent) {
        //grid.getChildren().removeAll();
//        phones.addAll(getDataPhone());
        if (phones.size() > 0) {
            setChosenPhone(phones.get(0));
            myListener = new MyListener() {
                @Override
                public void onClickListener(Produit phone) {
                    setChosenFruit((Fruit) phone);
                }
            };
        }
        int column = 0;
        int row = 1;
        try {
            for (int i = 0; i < phones.size(); i++) {

                System.out.println(phones.size());

                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(HelloApplication.class.getResource("item.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                ItemController itemController = fxmlLoader.getController();
                itemController.setDataPhone(phones.get(i),myListener);

                if (column == 5) {
                    column = 0;
                    row++;
                }

                grid.add(anchorPane, column++, row); //(child,column,row)
                //set grid width
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_PREF_SIZE);
//
                //set grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_PREF_SIZE);

                GridPane.setMargin(anchorPane, new Insets(8));
            }
        } catch (IOException e) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }
    }

    public void pcCategory(MouseEvent mouseEvent) {
    }

    public void houseCategory(MouseEvent mouseEvent) {


    }

    public void dressesCategory(MouseEvent mouseEvent) {
    }

    public void fruitCategory(MouseEvent mouseEvent) {


        //fruits.addAll(getData());
        if (fruits.size() > 0) {
            setChosenFruit(fruits.get(0));
//            myListener = new MyListener() {
//                @Override
//                public void onClickListener(Produit produit) {
//
//                }
//            };
            myListener = new MyListener() {
                @Override
                public void onClickListener(Produit fruit) {
                    setChosenFruit( fruit);
                }
            };
        }

        int column = 0;
        int row = 1;
        try {
            for (int i = 0; i < fruits.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(HelloApplication.class.getResource("item.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                ItemController itemController = fxmlLoader.getController();
                itemController.setData(fruits.get(i),myListener);

                if (column == 5) {
                    column = 0;
                    row++;
                }

                grid.add(anchorPane, column++, row); //(child,column,row)
                //set grid width
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_PREF_SIZE);
//
                //set grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_PREF_SIZE);

                GridPane.setMargin(anchorPane, new Insets(8));
            }
        } catch (IOException e) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }

    }

    public void landCategory(MouseEvent mouseEvent) {
    }
}
