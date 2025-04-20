package com.example.diyashop.controller.admin;

import com.example.diyashop.model.Model;
import com.example.diyashop.view.AdminOptionView;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class AdminMenuController implements Initializable {



 @FXML public Button customerManagement;
 @FXML public Button employeeManagement;



 @FXML
 private BorderPane employeeMenuPane;




 @Override
 public void initialize(URL url, ResourceBundle resourceBundle) {

  System.out.println("AdminMenuController initialize() called!");
  loadEmployeMenuPane();


 }

 public Pane loadEmployeMenuPane() {
  System.out.println("ui getting from employee menu!!!");

  try {
   FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/otherfxml/EmployeeMenu.fxml"));
   BorderPane employeeMenu = loader.load(); // ✅ This is the actual UI
   if(employeeMenu == null){
    System.out.println("I m null, employeemenu");
   }
   System.out.println("EmployeeMenu loaded successfully.");

   employeeMenuPane.setCenter(employeeMenu);
  } catch (IOException e) {
   e.printStackTrace();
  }
  return employeeMenuPane;
 }


 public void onEmployeeManagementClicked(ActionEvent actionEvent) {
  System.out.println("employee management got clicked!!!");
  Model.getInstance().getAdminViewFactory().getAdminOptionViewObjectProperty().set(AdminOptionView.EMPLOYEE_MANAGEMENT);
 }

 public void onCustomerManagementClicked(ActionEvent actionEvent) {
  System.out.println("Customer management got clicked!!!");
  Model.getInstance().getAdminViewFactory().getAdminOptionViewObjectProperty().set(AdminOptionView.CUSTOMER_MANAGEMENT);
 }

 public void onRecieptAdminClicked(){
  ObservableList<Node> list = loadEmployeMenuPane().getChildren();
  Button reciept = (Button)list.get(0);
  reciept.setOnAction(e-> System.out.println("reciept button in admin is activated"));
 // Button search = (Button)list.get(1);

 }
}
