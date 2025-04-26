package com.example.diyashop.controller.admin;

import com.example.diyashop.model.Model;
import com.example.diyashop.view.AdminOptionView;
import com.example.diyashop.view.CommonOptionView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminController   implements Initializable {


    @FXML
    private BorderPane adminPane;



    public BorderPane getAdminPane() {
         return adminPane;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("AdminController initialize() called!");

// To open employee management

// To

        Model.getInstance().getAdminViewFactory().getAdminOptionViewObjectProperty().addListener((observableValue, oldValue, newValue) -> {
            System.out.println("AdminController admin listener triggered: " + newValue);

            switch (newValue) {

                case PRODUCT_MANAGEMENT -> this.getAdminPane().setCenter(Model.getInstance().getAdminViewFactory().getProductManagementPane());
                case CUSTOMER_MANAGEMENT -> this.getAdminPane().setCenter(Model.getInstance().getAdminViewFactory().getCustomerManagementPane()); // customerpane ma lanu cha
                case EMPLOYEE_MANAGEMENT -> this.getAdminPane().setCenter(Model.getInstance().getAdminViewFactory().getEmployeeManagementPane());
                default -> this.getAdminPane().setCenter(Model.getInstance().getCommonViewFactory().getSearchAnchorPane());
            }
        });

        Model.getInstance().getCommonViewFactory().getCommonOptionViewObjectProperty().addListener((observable, oldvalue, nevalue) -> {
            System.out.println("AdminController common listener triggered: " + nevalue);

            switch (nevalue) {
                case RECIEPT -> this.getAdminPane().setCenter(Model.getInstance().getCommonViewFactory().getRecieptAnchorPane());
                case SEARCH -> this.getAdminPane().setCenter(Model.getInstance().getCommonViewFactory().getSearchAnchorPane());
                case PRODUCT_DETAILS -> this.getAdminPane().setCenter(Model.getInstance().getCommonViewFactory().getProductDetailsPane());
                default -> this.getAdminPane().setCenter(Model.getInstance().getCommonViewFactory().getSearchAnchorPane());

            }
        });


        System.out.println("AdminController initialize() called!2");


    }




}
