package com.example.ind_prj;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class DriversController {

    @FXML
    private Label teamsTitle;

    @FXML
    private ImageView maxVerstappen;



    @FXML
    void backToMain(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void openMaxProfile(MouseEvent event) {
        openModal("Frame7.fxml", "Max Verstappen Profile");
    }

    private void openModal(String fxmlName, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlName));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
