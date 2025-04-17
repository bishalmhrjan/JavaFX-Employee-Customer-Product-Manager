package com.example.diyashop.controller.admin;

import com.example.diyashop.controller.worker.EmployeeController;
import com.example.diyashop.model.Model;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminController   implements Initializable {
    @FXML private BorderPane adminParent;

    public BorderPane getAdminParent() {
        return adminParent;
    }


    @Override public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().addListener((observableValue, oldValue, newValue) ->{
            switch (newValue){


                case ADD_PRODUCT -> this.getAdminParent().setCenter(Model.getInstance().getViewFactory().getAddProductAnchorPane());
                case STATE_OF_PRODUCTS ->this.getAdminParent().setCenter(Model.getInstance().getAdminViewFactory().getStateOfProductsAnchorPane());


                default ->   this.getAdminParent().setCenter(Model.getInstance().getViewFactory().getSearchAnchorPane());

            }
        } );
    }
}
