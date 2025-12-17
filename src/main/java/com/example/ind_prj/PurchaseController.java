package com.example.ind_prj;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class PurchaseController {

    @FXML
    private Label quantityLabel;

    private int quantity = 1;

    @FXML
    void decreaseQuantity(ActionEvent event) {
        if (quantity > 1) {
            quantity--;
            quantityLabel.setText(String.valueOf(quantity));
        }
    }


    @FXML
    void increaseQuantity(ActionEvent event) {
        quantity++;
        quantityLabel.setText(String.valueOf(quantity));
    }



    @FXML
    void handleAdd(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("You have successfully reserved " + quantity + " ticket(s)!\nTotal price: " + String.format("%.2f", quantity * 1358.88) + " €");
        alert.showAndWait();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }






}
