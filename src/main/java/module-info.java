module com.example.oop9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oop9 to javafx.fxml;
    exports com.example.oop9;
    exports com.example.oop9.tabulation;
    opens com.example.oop9.tabulation to javafx.fxml;
}