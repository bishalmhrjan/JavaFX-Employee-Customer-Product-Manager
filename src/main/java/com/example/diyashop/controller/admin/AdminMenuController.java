package com.example.diyashop.controller.admin;

import com.example.diyashop.controller.employee.EmployeeMenuController;
import com.example.diyashop.model.Model;
import com.example.diyashop.view.AdminOptionView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminMenuController implements Initializable {



 @FXML
 private Button stateOfProducts;

 @FXML
 private EmployeeMenuController employeeMenuController;



 Button logOut;


 public Button getLogOut() {
  return logOut;
 }
 @Override
 public void initialize(URL url, ResourceBundle resourceBundle) {
  if(employeeMenuController != null){
   Button btn = employeeMenuController.getReceipt();
   if(btn != null){
    btn.setOnAction(e-> System.out.println("Reciept button clicked from adminmenu"));
   }
  }


 }





 public void onStateOfProductsClicked() {
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.STATE_OF_PRODUCTS);
 }
 public Button getStateOfProducts() {
  return stateOfProducts;
 }


}
