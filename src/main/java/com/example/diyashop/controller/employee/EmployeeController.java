package com.example.diyashop.controller.employee;

import com.example.diyashop.model.Model;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeController implements Initializable {
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
               case RECIEPT -> this.getBorderPane().setCenter(Model.getInstance().getViewFactory().getRecieptAnchorPane());
                case SEARCH -> this.getBorderPane().setCenter(Model.getInstance().getViewFactory().getSearchAnchorPane());
               default -> this.getBorderPane().setCenter(Model.getInstance().getViewFactory().getSearchAnchorPane());

            }
        });
    }




}
