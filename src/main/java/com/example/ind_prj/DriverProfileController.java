package com.example.ind_prj;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class DriverProfileController {


    @FXML
    private Button backButton;

    @FXML
    private Button videoButton;



    @FXML
    void handleBack(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void handleOpenVideo(ActionEvent event) {
        try {
            File videoFile = new File("src/main/resources/video/video_max.mp4");

            if (videoFile.exists()) {
                Desktop.getDesktop().open(videoFile);
            } else {
                System.out.println("Відеофайл не знайдено! Перевірте шлях: " + videoFile.getAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
