package com.example.flashmarket.controller;

import com.example.flashmarket.HelloApplication;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class InitPreloader implements Initializable {

    @FXML
    public Label lblLoading;
    public static Label lblLoadingg;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblLoadingg = lblLoading;
        System.out.println(lblLoadingg.getText());
    }

    public String checkFunction() {

        final String[] messages = {""};
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                messages[0] = "First function";
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        lblLoading.setText(messages[0]);
                        System.out.println(lblLoadingg.getText());
                    }
                });
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                messages[0] = "Second function";
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        lblLoadingg.setText(messages[0]);
                    }
                });
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    Stage stage = new Stage();
                    Parent root = FXMLLoader.load(HelloApplication.class.getResource("connexion.fxml"));
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return messages[0];
    }
}
