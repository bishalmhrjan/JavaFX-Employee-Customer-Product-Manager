package com.example.diyashop.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class CommonMenuController implements Initializable {
    @FXML
    public Button reciept;
    @FXML public Button search;

    public Button getReciept() {
        return reciept;
    }

    public Button getSearch() {
        return search;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
