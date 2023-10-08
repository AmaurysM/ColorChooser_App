module com.example.colorchooser_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.colorchooser_app to javafx.fxml;
    exports com.example.colorchooser_app;
}