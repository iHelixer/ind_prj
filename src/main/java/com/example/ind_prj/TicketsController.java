package com.example.ind_prj;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class TicketsController {

    @FXML
    void backToMain(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void handleBuyTicket(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Frame6.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Buy Ticket");
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Не вдалося відкрити сторінку покупки.");
        }
    }

    @FXML
    void handleSoldOut(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText("Перепрошуємо, білети розкуплені!");
        alert.showAndWait();
    }


}
