module com.example.flashmarket {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.flashmarket to javafx.fxml;
    exports com.example.flashmarket;
}