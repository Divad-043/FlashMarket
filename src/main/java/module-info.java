module FlashMarket {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.web;
    requires com.fasterxml.jackson.core;
    requires twilio;
    requires org.json;
    //requires jakarta.activation;
    requires java.activation;

    exports com.example.flashmarket to javafx.graphics;
    exports com.example.flashmarket.models;
    exports com.example.flashmarket.controller;
    exports test;
    opens com.example.flashmarket.controller to javafx.fxml;
    opens com.example.flashmarket to javafx.fxml, javafx.graphics;
}