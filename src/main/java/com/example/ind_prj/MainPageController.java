package com.example.ind_prj;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

import java.net.URI;


public class MainPageController {

    @FXML
    private ImageView ytButton;

    @FXML
    private ImageView instaButton;

    @FXML
    private ImageView twitterButton;

    @FXML
    private ImageView tvButton;

    @FXML
    private Button btnTickets;

    @FXML
    private Button btnDrivers;

    @FXML
    private Button btnTeams;

    @FXML
    private Button btnSignIn;

    @FXML
    private ImageView imgTopDriver;

    @FXML
    private ImageView imgTopTeam;

    @FXML
    private ImageView imgCalendar;




    @FXML
    void handleBtnTickets(ActionEvent event) {
        openModal("Frame5.fxml", "Tickets", (Node) event.getSource());
    }

    @FXML
    void handleBtnDrivers(ActionEvent event) {
        openModal("Frame3.fxml", "Drivers", (Node) event.getSource());
    }

    @FXML
    void handleBtnTeams(ActionEvent event) {
        openModal("Frame4.fxml", "Teams", (Node) event.getSource());
    }

    @FXML
    void handleBtnSignIn(ActionEvent event) {
        openModal("Frame2.fxml", "Sign In", (Node) event.getSource());
    }

    @FXML
    void handleTopDriverClick(MouseEvent event) {
        openModal("Frame7.fxml", "Top Driver", (Node) event.getSource());
    }

    @FXML
    void handleTopTeamClick(MouseEvent event) {
        openModal("Frame8.fxml", "Top Team", (Node) event.getSource());
    }

    @FXML
    void handleCalendarClick(MouseEvent event) {
        openModal("Frame5.fxml", "Calendar", (Node) event.getSource());
    }


    private void openModal(String fxmlName, String title, Node sourceElement) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlName));
            Parent root = loader.load();
            Stage modalStage = new Stage();
            modalStage.setTitle(title);
            modalStage.setScene(new Scene(root));
            modalStage.initModality(Modality.APPLICATION_MODAL);
            Stage parentStage = (Stage) sourceElement.getScene().getWindow();
            modalStage.initOwner(parentStage);
            modalStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Не вдалося відкрити вікно: " + fxmlName);
        }
    }



    @FXML
    void openInstagram(MouseEvent event){
        openWebpage("https://www.instagram.com/f1/");
    }

    @FXML
    void openTwitter(MouseEvent event){
        openWebpage("https://x.com/F1");
    }

    @FXML
    void openTv(MouseEvent event){
        openWebpage("https://f1tv.formula1.com/");
    }


    @FXML
    void openYoutube(MouseEvent event) {
        openWebpage("https://www.youtube.com/formula1");
    }


    private void openWebpage(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }














}
