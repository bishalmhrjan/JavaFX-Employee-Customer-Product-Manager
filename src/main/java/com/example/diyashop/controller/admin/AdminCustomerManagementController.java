package com.example.diyashop.controller.admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AdminCustomerManagementController {
    @FXML
    public TableView customerTableView;
    @FXML public TableColumn customerIdColumn;
    @FXML public TableColumn customerUsernameColumn;
    @FXML public TableColumn customerFirstNameColumn;
    @FXML public TableColumn customerLastNameColumn;
    @FXML public TableColumn customerEmailColumn;
    @FXML public TableColumn customerPhoneColumn;
    @FXML public Button addCustomerButton;
    @FXML public Button editCustomerButton;
    @FXML public Button deleteCustomerButton;
    @FXML public TextField usernameTextField;
    @FXML public TextField firstNameTextField;
    @FXML public TextField lastNameTextField;
    @FXML public TextField emailTextField;
    @FXML public TextField phoneTextField;
    @FXML public Button saveCustomerDetailsButton;
    @FXML public Button cancelCustomerDetailsButton;

    public void handleCancelCustomerDetails(ActionEvent actionEvent) {
    }

    public void handleSaveCustomerDetails(ActionEvent actionEvent) {
    }

    public void handleDeleteCustomer(ActionEvent actionEvent) {
    }

    public void handleEditCustomer(ActionEvent actionEvent) {
    }

    public void handleAddCustomer(ActionEvent actionEvent) {
    }
}
