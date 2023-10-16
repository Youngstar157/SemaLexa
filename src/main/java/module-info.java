module com.example.semalexa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.semalexa to javafx.fxml;
    exports com.example.semalexa;
}