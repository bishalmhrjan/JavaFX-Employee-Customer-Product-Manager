package com.example.diyashop.controller.admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminEmployeeManagementController implements Initializable {
    @FXML public TableColumn userIdColumn;
    @FXML public TableColumn usernameColumn;
    @FXML public TableColumn firstNameColumn;
    @FXML public TableColumn lastNameColumn;
    @FXML public TableColumn rolesColumn;
    @FXML public CheckBox adminRoleCheckBox;
    @FXML public Button saveChangesButton;
    @FXML public TableView userTableView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void handleSaveUserRoles(ActionEvent actionEvent) {
    }
}
