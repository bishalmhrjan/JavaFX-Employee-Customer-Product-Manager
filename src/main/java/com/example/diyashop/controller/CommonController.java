package com.example.diyashop.controller;

import com.example.diyashop.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class CommonController implements Initializable {
    @FXML
    private BorderPane borderPane;


    @FXML private ToggleGroup group;
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

    public void goUnderstanding(ActionEvent actionEvent) {
    }

    public void goBuild(ActionEvent actionEvent) {
    }

    public void goLogin(ActionEvent actionEvent) {
    }


}
