package com.example.diyashop.controller.admin;

import com.example.diyashop.controller.CommonMenuController;
import com.example.diyashop.model.Model;
import com.example.diyashop.view.AdminOptionView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminMenuController extends CommonMenuController {


 @FXML
 private Button addProduct;
 @FXML
 private Button reciept;
 @FXML
 private Button search;
 @FXML
 private Button stateOfProducts;


 @FXML private MenuButton businessChart;
 @FXML
 private MenuItem dailyChart;
 @FXML
 private MenuItem weeklyCharts;


 @FXML
 private MenuItem monthlyChart;

 @FXML
 private MenuItem quarterlyChart;
 @FXML
 private MenuItem halfYearlChart;
 @FXML
 private MenuItem yearlyChart;

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

 public Button getReciept() {
  return reciept;
 }

 public Button getSearch() {
  return search;
 }

 public Button getStateOfProducts() {
  return stateOfProducts;
 }

 public MenuButton getBusinessChart() {
  return businessChart;
 }

 public MenuItem getDailyChart() {
  return dailyChart;
 }

 public MenuItem getWeeklyCharts() {
  return weeklyCharts;
 }

 public MenuItem getMonthlyCharts() {
  return monthlyChart;
 }

 public MenuItem getQuarterlyChart() {
  return quarterlyChart;
 }

 public MenuItem getHalfYearlChart() {
  return halfYearlChart;
 }

 public MenuItem getYearlyChart() {
  return yearlyChart;
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

 @Override
 public void initialize(URL url, ResourceBundle resourceBundle) {
  this.getAddProduct().setOnAction(e-> onAddProductClicked());
  this.getReciept().setOnAction(e->onRecieptClicked());
  this.getSearch().setOnAction(e->onSearchClicked());
  this.getStateOfProducts().setOnAction(e->onStateOfProductsClicked());
  //Charts Begins
  this.getDailyChart().setOnAction(e->onDailyChartViewClicked());
  this.getWeeklyCharts().setOnAction(e->onWeeklyChartViewClicked());
  this.getMonthlyCharts().setOnAction(e->onMonthlyChartViewClicked());
  this.getQuarterlyChart().setOnAction(e->onQuarterlyChartViewClicked());
  this.getHalfYearlChart().setOnAction(e->onHalfYearChartViewClicked());
  this.getYearlyChart().setOnAction(e->onYearlyChartViewClicked());

   //Expenditure Begins
  this.getDailyExpenditrueChart().setOnAction(e->onDailyExpenditureClicked());
  this.getWeeklyExpenditrueChart().setOnAction(e->onWeeklyExpenditureClicked());
  this.getMonthlyExpenditrueChart().setOnAction(e->onMonthlyExpenditureClicked());
  this.getQuarterlyExpenditrueChart().setOnAction(e->onQuarterlyExpenditureClicked());
  this.getHalfYearlyExpenditrueChart().setOnAction(e->onHalfYearlyExpenditureClicked());
  this.getYearlyExpenditrueChart().setOnAction(e->onYearlyExpenditureClicked());

 }



 public void onAddProductClicked() {
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.ADD_PRODUCT);
 }

 public void onRecieptClicked() {
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.RECIEPT); ;
 }

 public void onSearchClicked() {
  Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminOptionView.SEARCH);
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

}
