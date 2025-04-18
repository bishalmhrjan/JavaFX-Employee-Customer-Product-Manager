package com.example.diyashop.controller.admin;

import com.example.diyashop.controller.employee.EmployeeMenuController;
import com.example.diyashop.model.Model;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminController   implements Initializable {


    @FXML
    private BorderPane adminParent;

    @FXML
    private AnchorPane adminMenuPlaceholder;


    @FXML
    private EmployeeMenuController employeeMenuController;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("AdminController initialize() called!");

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/admin/AdminMenu.fxml"));
            BorderPane adminMenu = loader.load(); // ✅ This is the actual UI
            // Controller is available here if needed:
            AdminMenuController adminMenuController = loader.getController();

            // ✅ Add adminMenu to the placeholder
            adminMenuPlaceholder.getChildren().setAll(adminMenu);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().addListener((observableValue, oldValue, newValue) -> {
            switch (newValue) {
                case ADD_PRODUCT -> adminParent.setCenter(Model.getInstance().getViewFactory().getAddProductAnchorPane());
                case STATE_OF_PRODUCTS -> adminParent.setCenter(Model.getInstance().getAdminViewFactory().getStateOfProductsAnchorPane());
                default -> adminParent.setCenter(Model.getInstance().getViewFactory().getSearchAnchorPane());
            }
        });
    }


}
