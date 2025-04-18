package com.example.diyashop.controller.admin;

import com.example.diyashop.controller.employee.EmployeeMenuController;
import com.example.diyashop.model.Model;
import com.example.diyashop.view.AdminOptionView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.ResourceBundle;

public class AdminMenuController implements Initializable {



 @FXML
 private Button stateOfProducts;


 @FXML
 private AnchorPane employeeMenuPane; // This gets injected

 @FXML
 private EmployeeMenuController employeeMenuController;



 @FXML
 private Button adminLogOut;


 public Button getLogOut() {
  return adminLogOut;
 }
 @Override
 public void initialize(URL url, ResourceBundle resourceBundle) {
  System.out.println("AdminMenuController initialize() called!");
// REMOVE THIS BLOCK
  FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/otherfxml/EmployeeMenu.fxml"));
  AnchorPane pane = null;
  try {
   pane = loader.load();
  } catch (IOException e) {
   throw new RuntimeException(e);
  }
  employeeMenuController = loader.getController();
  employeeMenuPane.getChildren().setAll(pane);


 }





 public void onAdminLogOutClicked(ActionEvent event) {
  System.out.println("Admin Log Out clicked!");
  // Implement your admin logout logic here, e.g.,
  // - Clearing session data
  // - Redirecting to the login screen
  Stage stage = (Stage) adminLogOut.getScene().getWindow();
  // Example: Model.getInstance().getViewFactory().showLoginWindow();
  stage.close(); // Or navigate to login
 }


 public Button getAdminLogOut() {
  return adminLogOut;
 }





 public void onStateOfProductsClicked() {
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.STATE_OF_PRODUCTS);
 }
 public Button getStateOfProducts() {
  return stateOfProducts;
 }



}
