module com.example.opt2new {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.opt2new to javafx.fxml;
    exports com.example.opt2new;
}