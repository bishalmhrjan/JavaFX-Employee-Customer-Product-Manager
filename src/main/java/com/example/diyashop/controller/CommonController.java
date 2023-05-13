package com.example.diyashop.controller;

import com.example.diyashop.model.Model;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class CommonController implements Initializable {
    @FXML
    private BorderPane borderPane;
    public BorderPane getBorderPane() {
        return borderPane;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getWorkerOptionViewObjectProperty().addListener((observable, oldvalue, nevalue) -> {
            switch (nevalue) {
                case RECIEPT ->
                        this.getBorderPane().setCenter(Model.getInstance().getViewFactory().getRecieptAnchorPane());

                default -> this.getBorderPane().setCenter(Model.getInstance().getViewFactory().getSearchAnchorPane());

            }
        });
    }
}
