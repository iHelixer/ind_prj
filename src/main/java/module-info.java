module com.example.ind_prj {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.media;


    opens com.example.ind_prj to javafx.fxml;
    exports com.example.ind_prj;
}