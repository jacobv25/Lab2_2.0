module com.example.lab2_sorting_utility {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab2_sorting_utility to javafx.fxml;
    exports com.example.lab2_sorting_utility;
}