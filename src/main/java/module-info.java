module com.example.snowbreak {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snowbreak to javafx.fxml;
    exports com.example.snowbreak;
}