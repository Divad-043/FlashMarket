package com.example.flashmarket.controller;

import com.example.flashmarket.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.json.JSONArray;
import org.json.JSONObject;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;


public class HelloController {

    public Button btnConnexion;
    public Hyperlink toInscription;
    public PasswordField password;
    public TextField username;
    public Label labelError;

    @FXML
    public void connexionClick(ActionEvent actionEvent) throws IOException {

        StringBuilder respnseContent = new StringBuilder();
        URL url = new URL("https://tpteam3.000webhostapp.com/java/login.php");

        if (Objects.equals(username.getText(), "") || Objects.equals(password.getText(), "")) {
            labelError.setText("Remplissez tous les champs");
        } else {
            Map<String,Object> params = new LinkedHashMap<>();
            params.put("username", username.getText());
            params.put("password", password.getText());

            StringBuilder postData = new StringBuilder();
            for (Map.Entry<String,Object> param : params.entrySet()) {
                if (postData.length() != 0) postData.append('&');
                postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                postData.append('=');
                postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
            }
            byte[] postDataBytes = postData.toString().getBytes("UTF-8");

            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
            conn.setDoOutput(true);
            conn.getOutputStream().write(postDataBytes);

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

            String line, response;
            while ((line = in.readLine()) != null)
                respnseContent.append(line);
            in.close();
            System.out.println(respnseContent.toString());

            //JSONArray results = new JSONArray();
            response = respnseContent.toString();
            JSONObject jsonObject = new JSONObject(response);
            System.out.println(jsonObject.toString());
            boolean success = jsonObject.getBoolean("success");

            if (success) {
                String username = jsonObject.getString("username");
                String location = jsonObject.getString("location");
                int phone = jsonObject.getInt("phone");

                //Parent root = FXMLLoader.load(HelloApplication.class.getResource("market.fxml"));
                Parent root = FXMLLoader.load(HelloApplication.class.getResource("/com/example/flashmarket/Accueil.fxml"));
                Stage window = (Stage) btnConnexion.getScene().getWindow();
                window.setScene(new Scene(root));
            } else
                labelError.setText("Vos identifiants sont incorrectes. Ressayer");
        }
    }

    public void goToInscription(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(HelloApplication.class.getResource("inscription.fxml"));
        Stage window = (Stage) btnConnexion.getScene().getWindow();
        window.setScene(new Scene(root));
    }
}