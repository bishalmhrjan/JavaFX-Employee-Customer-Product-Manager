package com.example.diyashop.controller.admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

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
    @FXML public TextField usernameTextField;
    @FXML public TextField firstNameTextField;
    @FXML public TextField lastNameTextField;
    @FXML public TextField emailTextField;
    @FXML public TextField rolesTextField;
    @FXML public Button saveEmployeeDetailsButton;
    @FXML public Button cancelEmployeeDetailsButton;
    @FXML public Button deleteEmployeeButton;
    @FXML public Button editEmployeeButton;
    @FXML public Button addEmployeeButton;
    @FXML public TableColumn employeeRolesColumn;
    @FXML public TableColumn employeeEmailColumn;
    @FXML public TableColumn employeeLastNameColumn;
    @FXML public TableColumn employeeFirstNameColumn;
    @FXML public TableColumn employeeUsernameColumn;
    @FXML public TableColumn employeeIdColumn;
    @FXML public TableView employeeTableView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void handleSaveUserRoles(ActionEvent actionEvent) {
    }

    public void handleAddEmployee(ActionEvent actionEvent) {
    }

    public void handleEditEmployee(ActionEvent actionEvent) {
    }

    public void handleDeleteEmployee(ActionEvent actionEvent) {
    }

    public void handleSaveEmployeeDetails(ActionEvent actionEvent) {
    }

    public void handleCancelEmployeeDetails(ActionEvent actionEvent) {
    }
}
