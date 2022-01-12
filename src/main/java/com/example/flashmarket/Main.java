package com.example.flashmarket;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static final String CURRENCY = "$";
    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("market.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("market.fxml"));
        primaryStage.setTitle("FlashMarket");
        primaryStage.setScene(new Scene(fxmlLoader.load()));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
