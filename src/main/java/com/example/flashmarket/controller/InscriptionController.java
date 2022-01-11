package com.example.flashmarket.controller;

import com.example.flashmarket.HelloApplication;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.ValidationRequest;
import com.twilio.type.PhoneNumber;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

public class InscriptionController {

    public PasswordField password;
    public Hyperlink toConnexion;
    public PasswordField cpassword;
    public TextField phone;
    public TextField username;
    public TextField address;
    public Button btnInscription;
    public Label labelError;

    public void inscriptionClick(ActionEvent actionEvent) throws Exception {

        URL url = new URL("https://tpteam3.000webhostapp.com/java/register.php");
        int code = (int) (Math.random()*1000);

        if (fieldVerification()) {
            if (Objects.equals(password.getText(), cpassword.getText())) {
                Map<String,Object> params = new LinkedHashMap<>();
                params.put("username", username.getText());
                params.put("password", password.getText());
                params.put("phone", phone.getText());
                params.put("location", address.getText());

                StringBuilder postData = new StringBuilder();
                StringBuffer respnseContent = new StringBuffer();
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

                // Add a number
                addANumber();
                // send a sms
                //sendSms(code);

                //read the response
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
                String line, response;
                while ((line = in.readLine()) != null)
                    respnseContent.append(line);

                System.out.println(respnseContent.toString());
                response = respnseContent.toString();
                //JSONArray results = new JSONArray(respnseContent);
                JSONObject result = new JSONObject(response);
                boolean success = result.getBoolean("success");
                System.out.println(success);

                if (success){
                    Parent root = FXMLLoader.load(HelloApplication.class.getResource("connexion.fxml"));
                    Stage window = (Stage) btnInscription.getScene().getWindow();
                    window.setScene(new Scene(root));
                } else
                    labelError.setText("Un probleme est survenu. Veuillez reessayer svp");
            } else {
                labelError.setText("Les mots de passe ne correspondent pas");
            }

        } else {
            labelError.setText("Veuillez remplir tous les champs");
        }
    }


    public void goToConnexion(ActionEvent actionEvent) throws IOException {

        Parent root = FXMLLoader.load(HelloApplication.class.getResource("connexion.fxml"));
        Stage window = (Stage) btnInscription.getScene().getWindow();
        window.setScene(new Scene(root));
    }


    public boolean fieldVerification() {
        if (Objects.equals(username.getText(), "") || Objects.equals(password.getText(), "") || Objects.equals(cpassword.getText(), "")
                || Objects.equals(phone.getText(), "") || Objects.equals(address.getText(), "")){
            return false;
        } else
            return true;
    }


    public void sendSms(int code){
        final String ACCOUNT_SID = "AC9e1d71023ffc262498a885749b53c97e";
        final String AUTH_TOKEN = "94f1695586c22cb0efac94a8cbadbaa8";

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber(phone.getText()),
                new PhoneNumber("+18645136946"),
                String.valueOf(code)).create();

        System.out.println(message.getSid());
    }

    public void addANumber() {
        final String ACCOUNT_SID = "AC9e1d71023ffc262498a885749b53c97e";
        final String AUTH_TOKEN = "94f1695586c22cb0efac94a8cbadbaa8";
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        ValidationRequest validationRequest = ValidationRequest.creator(
                        new com.twilio.type.PhoneNumber("+237655931893"))
                .setFriendlyName("237655931893")
                .create();

        System.out.println(validationRequest.getFriendlyName());
    }
}
