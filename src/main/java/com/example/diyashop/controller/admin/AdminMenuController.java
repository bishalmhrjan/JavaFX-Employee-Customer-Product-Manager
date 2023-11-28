package com.example.diyashop.controller.admin;

import com.example.diyashop.controller.worker.EmployeeMenuController;
import com.example.diyashop.model.Model;
import com.example.diyashop.view.AdminOptionView;
import com.example.diyashop.view.EmployeeOptionView;
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


 @FXML private MenuButton businessChart;
 @FXML
 private MenuItem dailyEarningChart;
 @FXML
 private MenuItem weeklyEarningCharts;


 @FXML
 private MenuItem monthlyEarningChart;

 @FXML
 private MenuItem quarterlyEarningChart;
 @FXML
 private MenuItem halfYearlyEarningChart;
 @FXML
 private MenuItem yearlyEarningChart;

@FXML
private MenuButton expenditureChart;


 @FXML
 private MenuItem dailyExpenditrueChart;
 @FXML
 private MenuItem weeklyExpenditrueChart;
 @FXML
 private MenuItem monthlyExpenditrueChart;
 @FXML
 private MenuItem quarterlyExpenditrueChart;
 @FXML
 private MenuItem halfYearlyExpenditrueChart;
 @FXML
 private MenuItem yearlyExpenditrueChart;


 public Button getAddProduct() {
  return addProduct;
 }




 public Button getStateOfProducts() {
  return stateOfProducts;
 }


 public MenuItem getDailyEarningChart() {
  return dailyEarningChart;
 }

 public MenuItem getWeeklyEarningCharts() {
  return weeklyEarningCharts;
 }

 public MenuItem getMonthlyCharts() {
  return monthlyEarningChart;
 }

 public MenuItem getQuarterlyEarningChart() {
  return quarterlyEarningChart;
 }

 public MenuItem getHalfYearlyEarningChart() {
  return halfYearlyEarningChart;
 }

 public MenuItem getYearlyEarningChart() {
  return yearlyEarningChart;
 }

 public MenuButton getExpenditureChart() {
  return expenditureChart;
 }

 public MenuItem getDailyExpenditrueChart() {
  return dailyExpenditrueChart;
 }

 public MenuItem getWeeklyExpenditrueChart() {
  return weeklyExpenditrueChart;
 }

 public MenuItem getMonthlyExpenditrueChart() {
  return monthlyExpenditrueChart;
 }

 public MenuItem getQuarterlyExpenditrueChart() {
  return quarterlyExpenditrueChart;
 }

 public MenuItem getHalfYearlyExpenditrueChart() {
  return halfYearlyExpenditrueChart;
 }

 public MenuItem getYearlyExpenditrueChart() {
  return yearlyExpenditrueChart;
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
  //Charts Begins
  this.getDailyEarningChart().setOnAction(e->onDailyChartViewClicked());
  this.getWeeklyEarningCharts().setOnAction(e->onWeeklyChartViewClicked());
  this.getMonthlyCharts().setOnAction(e->onMonthlyChartViewClicked());
  this.getQuarterlyEarningChart().setOnAction(e->onQuarterlyChartViewClicked());
  this.getHalfYearlyEarningChart().setOnAction(e->onHalfYearChartViewClicked());
  this.getYearlyEarningChart().setOnAction(e->onYearlyChartViewClicked());

   //Expenditure Begins
  this.getDailyExpenditrueChart().setOnAction(e->onDailyExpenditureClicked());
  this.getWeeklyExpenditrueChart().setOnAction(e->onWeeklyExpenditureClicked());
  this.getMonthlyExpenditrueChart().setOnAction(e->onMonthlyExpenditureClicked());
  this.getQuarterlyExpenditrueChart().setOnAction(e->onQuarterlyExpenditureClicked());
  this.getHalfYearlyExpenditrueChart().setOnAction(e->onHalfYearlyExpenditureClicked());
  this.getYearlyExpenditrueChart().setOnAction(e->onYearlyExpenditureClicked());

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
}
