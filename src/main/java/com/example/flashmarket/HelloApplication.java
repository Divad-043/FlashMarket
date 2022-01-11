package com.example.flashmarket;

//import com.sun.javafx.application.LauncherImpl;
//import com.sun.javafx.application.LauncherImpl;
import com.example.flashmarket.controller.InitPreloader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static Stage primaryStage = null;
    public static Scene primaryScene = null;


//    @Override
//    public void init() throws Exception {
//        InitPreloader initPreloader = new InitPreloader();
//        initPreloader.checkFunction();
//    }

    @Override
    public void start(Stage stage) throws IOException {
        //primaryStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("connexion.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 600);
        stage.setTitle("FlashMarket");
        stage.setResizable(true);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        //com.sun.javafx.application.LauncherImpl.launchApplication(HelloApplication.class, LauncherPreloader.class, args);
    }

}