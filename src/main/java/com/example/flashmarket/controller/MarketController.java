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

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class MarketController implements Initializable {

    public Label productName;
    public Label productPrice;
    public Label address;
    public Label location;
    public Label quantity;
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
    private List<Produit> phones = new ArrayList<>();
    private List<PC> pcs = new ArrayList<>();
    private List<Land> lands = new ArrayList<>();
    private List<Produit> houses = new ArrayList<>();
    private String[] colors;

    private Image image;
    private MyListener myListener;


    private static int nombre = 0;


    private void setChosenFruit(Produit fruit) {
        System.out.println(fruit.getImgSrc());
        productName.setText(fruit.getName());
        productPrice.setText(Main.CURRENCY + fruit.getPrice());
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
//        phones.addAll(Data.getDataPhone());
//        fruits.addAll(Data.getData());
//        pcs.addAll(Data.getDataPc());
//        lands.addAll(Data.getDataLand());
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
        colors = Data.color;
                phones = sendRequestToServer("https://tpteam3.000webhostapp.com/java/listOfPhone.php");
                houses = sendRequestToServer("https://tpteam3.000webhostapp.com/java/listproduct.php");

                dataLoading(phones);
//            }
//        });
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
                //houses = sendRequestToServer("https://tpteam3.000webhostapp.com/java/listproduct.php");
//            }
//        });
        //t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            //t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

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

        dataLoading(houses);
        //gridPane = new GridPane();

//        HttpURLConnection connection;
//        StringBuffer respnseContent = new StringBuffer();
//        BufferedReader reader;
//        String line;
//        try {
//            URL url = new URL("https://tpteam3.000webhostapp.com/java/listproduct.php");
//            connection = (HttpURLConnection) url.openConnection();
//
//            connection.setRequestMethod("POST");
//            connection.setConnectTimeout(5000);
//            connection.setReadTimeout(5000);
//
//            int status = connection.getResponseCode();
//            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//                respnseContent.append(line);
//            }
//            reader.close();
//            System.out.println(respnseContent.toString());
//            JSONArray results = new JSONArray(respnseContent.toString());
//
//////            System.out.println(results);
//            for (int i=0; i<results.length(); i++) {
//
//                JSONObject result = results.getJSONObject(i);
//                System.out.println(result.toString());
//                //JSONObject result = results.getJSONObject(i);
//                String nom = result.getString("nomProd");
//                double prix = result.getDouble("prix");
//                String img = result.getString("url_img");
//                House produit = new House();
//
//                ReadableByteChannel readChannel = Channels.newChannel(new URL(img).openStream());
//                FileOutputStream fileOS = new FileOutputStream("src/main/resources/com/example/flashmarket/test/test.jpg");
//                FileChannel writeChannel = fileOS.getChannel();
//                writeChannel
//                        .transferFrom(readChannel, 0, Long.MAX_VALUE);
//                produit.setImgSrc(img);
//                produit.setPrice(prix);
//                produit.setName(nom);
//                produit.setColor("FFFFFF");
//                houses.add((House) produit);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        //fruits.addAll(getData());
//        if (houses.size() > 0) {
//            setChosenFruit(houses.get(0));
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
//            for (int i = 0; i < houses.size(); i++) {
//                FXMLLoader fxmlLoader = new FXMLLoader();
//                fxmlLoader.setLocation(HelloApplication.class.getResource("item.fxml"));
//                AnchorPane anchorPane = fxmlLoader.load();
//
//                ItemController itemController = fxmlLoader.getController();
//                itemController.setData(houses.get(i),myListener);
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


    // Methode qui permet d'envoyer une requete au serveur et obtient la reponse sous forme de liste de produit
    public List<Produit> sendRequestToServer(String url) {

        HttpURLConnection connection;
        StringBuffer respnseContent = new StringBuffer();
        BufferedReader reader;
        String line;
        List<Produit> resultOfRequest = new ArrayList<>();

        try {
            respnseContent = urlRequest(url);
            //URL url = new URL("https://tpteam3.000webhostapp.com/java/listproduct.php");
//            URL url = new URL(urlRequest);
//            connection = (HttpURLConnection) url.openConnection();
//
//            connection.setRequestMethod("POST");
//            connection.setConnectTimeout(5000);
//            connection.setReadTimeout(5000);
//
//            int status = connection.getResponseCode();
//            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//                respnseContent.append(line);
//            }
//            reader.close();
            System.out.println(respnseContent.toString());
            JSONArray results = new JSONArray(respnseContent.toString());

            ArrayList<String> images = new ArrayList<>();

            for (int i=0; i<results.length(); i++) {
                JSONObject result = results.getJSONObject(i);
                System.out.println(result.toString());

                String img = result.getString("url_img");
                images.add(new String(img));
            }

            addFiles(images);

            System.out.println(results.length());
            //nombre = 0;
            int j = 0;
            for (int i=0; i<results.length(); i++) {

                nombre++;

                JSONObject result = results.getJSONObject(i);
                System.out.println(result.toString());
                //JSONObject result = results.getJSONObject(i);


                int id = result.getInt("id");
                int cat = result.getInt("id_cat");
                int user = result.getInt("id_user");
                //int quantity = result.getInt("quantity");
                String nom = result.getString("nomProd");
                double prix = result.getDouble("prix");
                String img = result.getString("url_img");
                Produit produit = new Produit();




//                ReadableByteChannel readChannel = Channels.newChannel(new URL(img).openStream());
//                FileOutputStream fileOS = new FileOutputStream("src/main/resources/com/example/flashmarket/tmp_file"+nombre+".jpg");
//                FileChannel writeChannel = fileOS.getChannel();
//                writeChannel
//                        .transferFrom(readChannel, 0, Long.MAX_VALUE);
//
//                Files.copy(Path.of("src/main/resources/com/example/flashmarket/tmp_file"+nombre+".jpg"), Path.of("src/main/resources/com/example/flashmarket/tmp/tmp_file"+nombre+".jpg"), StandardCopyOption.REPLACE_EXISTING);
                String urlTmpFile = "tmp/tmp_file"+(nombre-1)+".jpg";
                //produit.setImgSrc(HelloApplication.class.getResource(urlTmpFile).toExternalForm());
                produit.setImgSrc("file:///C:/Users/Divad/Desktop/FlashMarket/src/main/resources/com/example/flashmarket/tmp/tmp_file"+(nombre-1)+".jpg");
                //produit.setImgSrc(img);
                produit.setPrice(prix);
                produit.setName(nom);
                produit.setColor(colors[j]);
                j++;
                if (j == 9)
                    j = 0;
                resultOfRequest.add(produit);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultOfRequest;
    }


    public void addFiles(ArrayList<String> images) throws Exception{

        int number = nombre;

        for (int i=0; i<images.size(); i++) {

            System.out.println("telechargement de l'image "+i);

            ReadableByteChannel readChannel = Channels.newChannel(new URL(images.get(i)).openStream());
            FileOutputStream fileOS = new FileOutputStream("src/main/resources/com/example/flashmarket/tmp_file"+number+".jpg");
            FileChannel writeChannel = fileOS.getChannel();
            writeChannel
                    .transferFrom(readChannel, 0, Long.MAX_VALUE);

            Files.copy(Path.of("src/main/resources/com/example/flashmarket/tmp_file"+number+".jpg"), Path.of("src/main/resources/com/example/flashmarket/tmp/tmp_file"+number+".jpg"), StandardCopyOption.REPLACE_EXISTING);
//            String urlTmpFile = "tmp/tmp_file"+nombre+".jpg";
//            produit.setImgSrc(HelloApplication.class.getResource(urlTmpFile).toExternalForm());
            number++;
        }
    }

    public String getOthersDetailsProduct(Produit produit) {

        String url;
        switch (produit.getCategory()) {
            case 1:

        }
        return null;
    }


    public StringBuffer urlRequest(String urlR) throws IOException {
        HttpURLConnection connection;
        StringBuffer respnseContent = new StringBuffer();
        BufferedReader reader;
        String line;
        List<Produit> resultOfRequest = new ArrayList<>();

        //try {
            //URL url = new URL("https://tpteam3.000webhostapp.com/java/listproduct.php");
            URL url = new URL(urlR);
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

            return respnseContent;
    }

}
