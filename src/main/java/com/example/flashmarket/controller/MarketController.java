package com.example.flashmarket.controller;

import com.example.flashmarket.HelloApplication;
import com.example.flashmarket.Main;
import com.example.flashmarket.MyListener;
import com.example.flashmarket.models.*;
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
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
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

    private GridPane gridPane;
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//
//    }

    private List<Fruit> fruits = new ArrayList<>();
    private List<Fruit> phones = new ArrayList<>();
    private List<PC> pcs = new ArrayList<>();
    private List<Land> lands = new ArrayList<>();
    private List<House> houses = new ArrayList<>();

    private Image image;
    private MyListener myListener;





    private void setChosenFruit(Produit fruit) {
        fruitNameLable.setText(fruit.getName());
        fruitPriceLabel.setText(Main.CURRENCY + fruit.getPrice());
        //image = new Image(HelloApplication.class.getResource("images/"+fruit.getImgSrc()).toExternalForm());
        //image = new Image(getClass().getResource(fruit.getImgSrc()).toExternalForm());
        image = new Image(fruit.getImgSrc().toString());
        fruitImg.setImage(image);
        chosenFruitCard.setStyle("-fx-background-color: #" + fruit.getColor() + ";\n" +
                "    -fx-background-radius: 30;");
    }

    private void setChosenPhone(Produit phone) {
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
        phones.addAll(Data.getDataPhone());
        fruits.addAll(Data.getData());
        pcs.addAll(Data.getDataPc());
        lands.addAll(Data.getDataLand());
        //houses.addAll(Data.getDataHouse());
        //gridPane = grid;
//        fruits.addAll(getData());
//        if (phones.size() > 0) //{
//            setChosenFruit(houses.get(0));
////            myListener = new MyListener() {
////                @Override
////                public void onClickListener(Object fruit) {
////                    setChosenFruit((Fruit) fruit);
////                }
////            };
//        myListener = new MyListener() {
//            @Override
//            public void onClickListener(Produit fruit) {
//                setChosenFruit( fruit);
//            }
//        };
////        }
//        int column = 0;
//        int row = 1;
//        try {
//            for (int i = 0; i < phones.size(); i++) {
//                FXMLLoader fxmlLoader = new FXMLLoader();
//                fxmlLoader.setLocation(HelloApplication.class.getResource("item.fxml"));
//                AnchorPane anchorPane = fxmlLoader.load();
//
//                ItemController itemController = fxmlLoader.getController();
//                itemController.setData(phones.get(i),myListener);
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
        dataLoading(phones);
//        gridPane = new GridPane();
//        //grid.getChildren().removeAll();
////        phones.addAll(getDataPhone());
//        if (phones.size() > 0) {
//            setChosenPhone(phones.get(0));
//            myListener = new MyListener() {
//                @Override
//                public void onClickListener(Produit phone) {
//                    setChosenPhone((Fruit) phone);
//                }
//            };
//        }
//        int column = 0;
//        int row = 1;
//        try {
//            for (int i = 0; i < phones.size(); i++) {
//
//                System.out.println(phones.size());
//
//                FXMLLoader fxmlLoader = new FXMLLoader();
//                fxmlLoader.setLocation(HelloApplication.class.getResource("item.fxml"));
//                AnchorPane anchorPane = fxmlLoader.load();
//
//                ItemController itemController = fxmlLoader.getController();
//                itemController.setData(phones.get(i),myListener);
//
//                if (column == 5) {
//                    column = 0;
//                    row++;
//                }
//
//                gridPane.add(anchorPane, column++, row); //(child,column,row)
//                //set grid width
//                gridPane.setMinWidth(Region.USE_COMPUTED_SIZE);
//                gridPane.setPrefWidth(Region.USE_COMPUTED_SIZE);
//                gridPane.setMaxWidth(Region.USE_PREF_SIZE);
////
//                //set grid height
//                gridPane.setMinHeight(Region.USE_COMPUTED_SIZE);
//                gridPane.setPrefHeight(Region.USE_COMPUTED_SIZE);
//                gridPane.setMaxHeight(Region.USE_PREF_SIZE);
//
//                scroll.setContent(gridPane);
//                GridPane.setMargin(anchorPane, new Insets(8));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//            //System.out.println(e.getMessage());
//        }
    }

    public void pcCategory(MouseEvent mouseEvent) {
        dataLoading(pcs);
//        gridPane = new GridPane();
//        //grid.getChildren().removeAll();
////        phones.addAll(getDataPhone());
//        if (pcs.size() > 0) {
//            setChosenPhone(pcs.get(0));
//            myListener = new MyListener() {
//                @Override
//                public void onClickListener(Produit phone) {
//                    setChosenFruit(phone);
//                }
//            };
//        }
//        int column = 0;
//        int row = 1;
//        try {
//            for (int i = 0; i < pcs.size(); i++) {
//
//                System.out.println(pcs.size());
//
//                FXMLLoader fxmlLoader = new FXMLLoader();
//                fxmlLoader.setLocation(HelloApplication.class.getResource("item.fxml"));
//                AnchorPane anchorPane = fxmlLoader.load();
//
//                ItemController itemController = fxmlLoader.getController();
//                itemController.setData(pcs.get(i),myListener);
//
//                if (column == 5) {
//                    column = 0;
//                    row++;
//                }
//
//                gridPane.add(anchorPane, column++, row); //(child,column,row)
//                //set grid width
//                gridPane.setMinWidth(Region.USE_COMPUTED_SIZE);
//                gridPane.setPrefWidth(Region.USE_COMPUTED_SIZE);
//                gridPane.setMaxWidth(Region.USE_PREF_SIZE);
////
//                //set grid height
//                gridPane.setMinHeight(Region.USE_COMPUTED_SIZE);
//                gridPane.setPrefHeight(Region.USE_COMPUTED_SIZE);
//                gridPane.setMaxHeight(Region.USE_PREF_SIZE);
//
//                scroll.setContent(gridPane);
//                GridPane.setMargin(anchorPane, new Insets(8));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//            //System.out.println(e.getMessage());
//        }
    }

    public void houseCategory(MouseEvent mouseEvent) {

        gridPane = new GridPane();

        HttpURLConnection connection;
        StringBuffer respnseContent = new StringBuffer();
        BufferedReader reader;
        String line;
        try {
            URL url = new URL("https://tpteam3.000webhostapp.com/java/listproduct.php");
            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("POST");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                respnseContent.append(line);
            }
            reader.close();
            System.out.println(respnseContent.toString());
            JSONArray results = new JSONArray(respnseContent.toString());

////            System.out.println(results);
            for (int i=0; i<results.length(); i++) {

                JSONObject result = results.getJSONObject(i);
                System.out.println(result.toString());
                //JSONObject result = results.getJSONObject(i);
                String nom = result.getString("nomProd");
                double prix = result.getDouble("prix");
                String img = result.getString("url_img");
                House produit = new House();

                ReadableByteChannel readChannel = Channels.newChannel(new URL(img).openStream());
                FileOutputStream fileOS = new FileOutputStream("src/main/resources/com/example/flashmarket/test/test.jpg");
                FileChannel writeChannel = fileOS.getChannel();
                writeChannel
                        .transferFrom(readChannel, 0, Long.MAX_VALUE);
                produit.setImgSrc(img);
                produit.setPrice(prix);
                produit.setName(nom);
                produit.setColor("FFFFFF");
                houses.add((House) produit);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        //fruits.addAll(getData());
        if (houses.size() > 0) {
            setChosenFruit(houses.get(0));
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

            for (int i = 0; i < houses.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(HelloApplication.class.getResource("item.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                ItemController itemController = fxmlLoader.getController();
                itemController.setData(houses.get(i),myListener);


                System.out.println(gridPane.getChildren().size());

                if (column == 5) {
                    column = 0;
                    row++;
                }

                gridPane.add(anchorPane, column++, row); //(child,column,row)
                //set grid width
                gridPane.setMinWidth(Region.USE_COMPUTED_SIZE);
                gridPane.setPrefWidth(Region.USE_COMPUTED_SIZE);
                gridPane.setMaxWidth(Region.USE_PREF_SIZE);

                //set grid height
                gridPane.setMinHeight(Region.USE_COMPUTED_SIZE);
                gridPane.setPrefHeight(Region.USE_COMPUTED_SIZE);
                gridPane.setMaxHeight(Region.USE_PREF_SIZE);

                scroll.setContent(gridPane);
                GridPane.setMargin(anchorPane, new Insets(8));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void dressesCategory(MouseEvent mouseEvent) {
    }

    public void fruitCategory(MouseEvent mouseEvent) {

        dataLoading(fruits);
//        gridPane = new GridPane();
//        //fruits.addAll(getData());
//        if (fruits.size() > 0) {
//            setChosenFruit(fruits.get(0));
//            myListener = new MyListener() {
//                @Override
//                public void onClickListener(Produit fruit) {
//                    setChosenFruit( fruit);
//                }
//            };
//        }
//
//        int column = 0;
//        int row = 1;
//        try {
//
//            for (int i = 0; i < fruits.size(); i++) {
//                FXMLLoader fxmlLoader = new FXMLLoader();
//                fxmlLoader.setLocation(HelloApplication.class.getResource("item.fxml"));
//                AnchorPane anchorPane = fxmlLoader.load();
//
//                ItemController itemController = fxmlLoader.getController();
//                itemController.setData(fruits.get(i),myListener);
//
//
//                System.out.println(gridPane.getChildren().size());
//
//                if (column == 5) {
//                    column = 0;
//                    row++;
//                }
//
//                gridPane.add(anchorPane, column++, row); //(child,column,row)
//                //set grid width
//                gridPane.setMinWidth(Region.USE_COMPUTED_SIZE);
//                gridPane.setPrefWidth(Region.USE_COMPUTED_SIZE);
//                gridPane.setMaxWidth(Region.USE_PREF_SIZE);
//
//                //set grid height
//                gridPane.setMinHeight(Region.USE_COMPUTED_SIZE);
//                gridPane.setPrefHeight(Region.USE_COMPUTED_SIZE);
//                gridPane.setMaxHeight(Region.USE_PREF_SIZE);
//
//                scroll.setContent(gridPane);
//                GridPane.setMargin(anchorPane, new Insets(8));
//            }
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    public void landCategory(MouseEvent mouseEvent) {
        dataLoading(lands);
//        gridPane = new GridPane();
//        //fruits.addAll(getData());
//        if (lands.size() > 0) {
//            setChosenFruit(lands.get(0));
//            myListener = new MyListener() {
//                @Override
//                public void onClickListener(Produit fruit) {
//                    setChosenFruit( fruit);
//                }
//            };
//        }
//
//        int column = 0;
//        int row = 1;
//        try {
//
//            for (int i = 0; i < lands.size(); i++) {
//                FXMLLoader fxmlLoader = new FXMLLoader();
//                fxmlLoader.setLocation(HelloApplication.class.getResource("item.fxml"));
//                AnchorPane anchorPane = fxmlLoader.load();
//
//                ItemController itemController = fxmlLoader.getController();
//                itemController.setData(lands.get(i),myListener);
//
//
//                System.out.println(gridPane.getChildren().size());
//
//                if (column == 5) {
//                    column = 0;
//                    row++;
//                }
//
//                gridPane.add(anchorPane, column++, row); //(child,column,row)
//                //set grid width
//                gridPane.setMinWidth(Region.USE_COMPUTED_SIZE);
//                gridPane.setPrefWidth(Region.USE_COMPUTED_SIZE);
//                gridPane.setMaxWidth(Region.USE_PREF_SIZE);
//
//                //set grid height
//                gridPane.setMinHeight(Region.USE_COMPUTED_SIZE);
//                gridPane.setPrefHeight(Region.USE_COMPUTED_SIZE);
//                gridPane.setMaxHeight(Region.USE_PREF_SIZE);
//
//                scroll.setContent(gridPane);
//                GridPane.setMargin(anchorPane, new Insets(8));
//            }
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public void dataLoading(List<? extends Produit> produits) {
        gridPane = new GridPane();
        //fruits.addAll(getData());
        if (produits.size() > 0) {
            setChosenFruit(produits.get(0));
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

            for (int i = 0; i < produits.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(HelloApplication.class.getResource("item.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                ItemController itemController = fxmlLoader.getController();
                itemController.setData(produits.get(i),myListener);

                System.out.println(gridPane.getChildren().size());

                if (column == 5) {
                    column = 0;
                    row++;
                }

                gridPane.add(anchorPane, column++, row); //(child,column,row)
                //set grid width
                gridPane.setMinWidth(Region.USE_COMPUTED_SIZE);
                gridPane.setPrefWidth(Region.USE_COMPUTED_SIZE);
                gridPane.setMaxWidth(Region.USE_PREF_SIZE);

                //set grid height
                gridPane.setMinHeight(Region.USE_COMPUTED_SIZE);
                gridPane.setPrefHeight(Region.USE_COMPUTED_SIZE);
                gridPane.setMaxHeight(Region.USE_PREF_SIZE);

                scroll.setContent(gridPane);
                GridPane.setMargin(anchorPane, new Insets(8));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
