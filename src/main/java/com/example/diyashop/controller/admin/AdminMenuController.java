package com.example.diyashop.controller.admin;

import com.example.diyashop.controller.worker.EmployeeMenuController;
import com.example.diyashop.model.Model;
import com.example.diyashop.view.AdminOptionView;
import com.example.diyashop.view.EmployeeOptionView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminMenuController extends EmployeeMenuController {



 @FXML
 public Button logOut;
 @FXML
 private Button addProduct;

 @FXML
 private Button stateOfProducts;


 public Button getAddProduct() {
  return addProduct;
 }




 public Button getStateOfProducts() {
  return stateOfProducts;
 }


 public Button getLogOut() {
  return logOut;
 }
 @Override
 public void initialize(URL url, ResourceBundle resourceBundle) {
  this.getAddProduct().setOnAction(e -> onAddProductClicked());
  this.getReceipt().setOnAction(e->onAdminReciptClicked());
  this.getSearch().setOnAction(e->onSearchClicked());
  this.getStateOfProducts().setOnAction(e->onStateOfProductsClicked());
  this.getLogOut().setOnAction(e->onLogOutClick());
 }

 public void onSearchClicked() {
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.ADMIN_SEARCH);
 }
 public void onAdminReciptClicked(){
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.ADMIN_RECIEPT);

 }
 public void onAddProductClicked() {
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.ADD_PRODUCT);
 }





 public void onStateOfProductsClicked() {
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.STATE_OF_PRODUCTS);
 }




 public void onDailyChartViewClicked() {
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.DAILY_VIEW);
 }

 public void onWeeklyChartViewClicked() {
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.WEEKLY_VIEW);
 }

 public void onMonthlyChartViewClicked() {
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.MOTHLY_VIEW);
 }


 public void onQuarterlyChartViewClicked() {
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.QUATERLY_VIEW);
 }

 public void onHalfYearChartViewClicked() {
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.HALF_YEARLY_VIEW);
 }

 public void onYearlyChartViewClicked() {
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.YEARLY_VIEW);
 }

 public void onDailyExpenditureClicked() {
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.DAILY_EXPENDITURE);
 }
 public void onWeeklyExpenditureClicked() {
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.WEEKLY_EXPENDITURE);
 }
 public void onMonthlyExpenditureClicked() {
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.MONTHLY_EXPENDITURE);
 }
 public void onQuarterlyExpenditureClicked() {
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.QUARTERLY_EXPENDITURE);
 }

 public void onHalfYearlyExpenditureClicked() {
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.HALF_YEARLY_EXPENDITURE);
 }
 public void onYearlyExpenditureClicked() {
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.YEARLY_EXPENDITURE);
 }


 public void onLogOutClick(){
  ((Stage)logOut.getScene().getWindow()).close();
 }

    public void goTabPane(ActionEvent actionEvent) {
    }

 public void goTitledPane(ActionEvent actionEvent) {
 }

 public void goAccordion(ActionEvent actionEvent) {
 }

 public void goButton(ActionEvent actionEvent) {
 }

 public void goCarousel(ActionEvent actionEvent) {
 }

 public void goCheckBox(ActionEvent actionEvent) {
 }

 public void goChoiceBox(ActionEvent actionEvent) {
 }

 public void goColorPicker(ActionEvent actionEvent) {
 }

 public void goComboBox(ActionEvent actionEvent) {
 }

 public void goDatePicker(ActionEvent actionEvent) {
 }

 public void goHyperlink(ActionEvent actionEvent) {
 }

 public void goLabels(ActionEvent actionEvent) {
 }

 public void goHtmlEditor(ActionEvent actionEvent) {
 }

 public void goListView(ActionEvent actionEvent) {
 }

 public void goMediaView(ActionEvent actionEvent) {
 }

 public void goMenuBar(ActionEvent actionEvent) {
 }

 public void goMenuButton(ActionEvent actionEvent) {
 }

 public void goPagination(ActionEvent actionEvent) {
 }

 public void goProgressbar(ActionEvent actionEvent) {
 }

 public void goRadioButton(ActionEvent actionEvent) {
 }

 public void goSpinner(ActionEvent actionEvent) {
 }

 public void goPassword(ActionEvent actionEvent) {
 }

 public void goRating(ActionEvent actionEvent) {
 }

 public void goSlider(ActionEvent actionEvent) {
 }

 public void goTableView(ActionEvent actionEvent) {
 }

 public void goTextField(ActionEvent actionEvent) {
 }

 public void goSwitch(ActionEvent actionEvent) {
 }

 public void goTreeTableView(ActionEvent actionEvent) {
 }

 public void goTreeView(ActionEvent actionEvent) {
 }
}
