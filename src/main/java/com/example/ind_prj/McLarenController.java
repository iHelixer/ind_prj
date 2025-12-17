package com.example.ind_prj;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class McLarenController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnArch;



    @FXML
    void handleBack(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }


    @FXML
    void handleOpenArchive(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Media.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Media");
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);

            stage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Не вдалося відкрити Media.fxml");
        }
    }



}
