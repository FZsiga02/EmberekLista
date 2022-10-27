module com.example.embereklista {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.embereklista to javafx.fxml;
    exports com.example.embereklista;
}