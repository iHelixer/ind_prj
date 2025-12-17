package com.example.ind_prj;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistrationController {
    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button signInButton;

    @FXML
    void handleLogin(ActionEvent event) {
        String email = emailField.getText();
        String password = passwordField.getText();

        if (email.equals("admin") && password.equals("12345")) {
            showInfo("Успіх", "Ви успішно увійшли!");
            Node source = (Node) event.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            stage.close();

        } else {
            showError("Помилка", "Невірний email або пароль!");
        }
    }

    private void showInfo(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void showError(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
