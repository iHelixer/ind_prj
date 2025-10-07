module com.example.ind_prj {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ind_prj to javafx.fxml;
    exports com.example.ind_prj;
}