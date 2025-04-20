package com.example.diyashop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ProductDetailsController {

    @FXML public TableView productTableView;
    @FXML public TableColumn productIdColumn;
    @FXML public TableColumn productNameColumn;
    @FXML public TableColumn productTypeColumn;
    @FXML public TableColumn priceColumn;
    @FXML public Button deactivateProductButton;
    @FXML public Button activateProductButton;
    @FXML public Button addProductButton;
    @FXML public Button editProductButton;
    @FXML public Button deleteProductButton;
    @FXML  public TableColumn statusChecbox;

    public void handleDeactivateProduct(ActionEvent actionEvent) {
    }

    public void handleActivateProduct(ActionEvent actionEvent) {
    }

    public void handleAddProduct(ActionEvent actionEvent) {
    }

    public void handleEditProduct(ActionEvent actionEvent) {
    }

    public void handleDeleteProduct(ActionEvent actionEvent) {
    }
}
