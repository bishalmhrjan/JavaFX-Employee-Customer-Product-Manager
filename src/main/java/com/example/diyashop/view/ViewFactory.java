package com.example.diyashop.view;

import com.example.diyashop.controller.admin.AdminController;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {


    //Admin views

    private  AnchorPane addProductAnchorPane;
    private  AnchorPane recieptAnchorPane;
    private  AnchorPane searchAnchorPane;

    //Expenditure
    private  AnchorPane dailyExpenditureAnchorPane;
    private  AnchorPane weeklyExpenditureAnchorPane;
    private  AnchorPane MonthlyExpenditureAnchorPane;
    private  AnchorPane quaterlyExpenditureAnchorPane;
    private  AnchorPane halfYealryExpenditureAnchorPane;
    private  AnchorPane yealryExpenditureAnchorPane;
    private  AnchorPane stateOfProductsAnchorPane;

    // Chart
    private  AnchorPane dailyViewAnchorPane;

    private  AnchorPane monthlyViewAnchorPane;
    private  AnchorPane weeklyViewAnchorPane;
    private  AnchorPane quaterlyViewAnchorPane;
    private  AnchorPane halfYearlyViewAnchorPane;
    private  AnchorPane yearlyViewAnchorPane;

    private AccountType accountType;
    private final ObjectProperty<CommonOptionView> commonOptionViewObjectProperty;
    private final ObjectProperty<AdminOptionView> adminOptionViewObjectProperty;





    public  ViewFactory(){
        this.accountType=AccountType.EMPLOYEE;
        this.commonOptionViewObjectProperty = new SimpleObjectProperty<>();
        this.adminOptionViewObjectProperty = new SimpleObjectProperty<>();
    }

    public ObjectProperty<CommonOptionView> getWorkerOptionViewObjectProperty() {
        return commonOptionViewObjectProperty;
    }

    public AccountType getAccountType() {

        return accountType;
    }



    public ObjectProperty<AdminOptionView> getAdminSelectedMenuItem() {
        return adminOptionViewObjectProperty;
    }
    public AnchorPane getRecieptAnchorPane() {

        if(this.recieptAnchorPane==null){
            try{
                this.recieptAnchorPane = new FXMLLoader(getClass().getResource("/Reciept.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return recieptAnchorPane;
    }

    public AnchorPane getSearchAnchorPane() {
        if(this.searchAnchorPane==null){
            try{
                this.searchAnchorPane = new FXMLLoader(getClass().getResource("/SearchProduct.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return searchAnchorPane;
    }


    public void showLogInWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Anmelde.fxml"));
        createStage(loader);

    }

    public AnchorPane getAddProductAnchorPane() {
        if(this.addProductAnchorPane==null){
            try{
                this.addProductAnchorPane = new FXMLLoader(getClass().getResource("/Admin/AddProduct.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return addProductAnchorPane;
    }

    public AnchorPane getStateOfProductsAnchorPane() {
        if(this.stateOfProductsAnchorPane==null){
            try{
                this.stateOfProductsAnchorPane = new FXMLLoader(getClass().getResource("/Admin/StateOfProducts.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stateOfProductsAnchorPane;
    }



//Charts
    public AnchorPane getDailyViewAnchorPane() {
        if(this.dailyViewAnchorPane==null){
            try{
                this.dailyViewAnchorPane = new FXMLLoader(getClass().getResource("/Admin/DailyChart.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return dailyViewAnchorPane;
    }
    public AnchorPane getMonthlyViewAnchorPane(){

        if(this.monthlyViewAnchorPane==null){
            try{
                this.monthlyViewAnchorPane = new FXMLLoader(getClass().getResource("/Admin/MonthlyChart.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return monthlyViewAnchorPane;
    }

    public AnchorPane getWeeklyViewAnchorPane() {
        if(this.weeklyViewAnchorPane==null){
            try{
                this.weeklyViewAnchorPane = new FXMLLoader(getClass().getResource("/Admin/WeeklyChart.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return weeklyViewAnchorPane;
    }

    public AnchorPane getQuaterlyViewAnchorPane() {
        if(this.quaterlyViewAnchorPane==null){
            try{
                this.quaterlyViewAnchorPane = new FXMLLoader(getClass().getResource("/Admin/QuarterlyChart.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return quaterlyViewAnchorPane;
    }

    public AnchorPane getHalfYearlyViewAnchorPane() {
        if(this.halfYearlyViewAnchorPane==null){
            try{
                this.halfYearlyViewAnchorPane = new FXMLLoader(getClass().getResource("/Admin/HalfYearlyChart.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return halfYearlyViewAnchorPane;
    }

    public AnchorPane getYearlyViewAnchorPane() {
        if(this.yearlyViewAnchorPane ==null){
            try{
                this.yearlyViewAnchorPane = new FXMLLoader(getClass().getResource("/Admin/YearlyChart.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return yearlyViewAnchorPane;
    }




//Expenditure
    public AnchorPane getDailyExpenditureAnchorPane() {
        if(this.dailyExpenditureAnchorPane==null){
            try{
                this.dailyExpenditureAnchorPane = new FXMLLoader(getClass().getResource("/Admin/DailyExpenditure.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }  return dailyExpenditureAnchorPane;
    }

    public AnchorPane getWeeklyExpenditureAnchorPane() {
        if(this.weeklyExpenditureAnchorPane==null){
            try{
                this.weeklyExpenditureAnchorPane = new FXMLLoader(getClass().getResource("/Admin/WeeklyChartExpenditure.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } return weeklyExpenditureAnchorPane;
    }

    public AnchorPane getMonthlyExpenditureAnchorPane() {
        if(this.MonthlyExpenditureAnchorPane==null){
            try{
                this.MonthlyExpenditureAnchorPane = new FXMLLoader(getClass().getResource("/Admin/MonthlyChartExpenditure.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } return MonthlyExpenditureAnchorPane;
    }

    public AnchorPane getQuaterlyExpenditureAnchorPane() {
        if(this.quaterlyExpenditureAnchorPane==null){
            try{
                this.quaterlyExpenditureAnchorPane = new FXMLLoader(getClass().getResource("/Admin/QuarterlyChartExpenditure.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } return quaterlyExpenditureAnchorPane;
    }

    public AnchorPane getHalfYealryExpenditureAnchorPane() {
        if(this.halfYealryExpenditureAnchorPane==null){
            try{
                this.halfYealryExpenditureAnchorPane = new FXMLLoader(getClass().getResource("/Admin/HalfYearlyChartExpenditure.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } return halfYealryExpenditureAnchorPane;
    }

    public AnchorPane getYealryExpenditureAnchorPane() {
        if(this.yealryExpenditureAnchorPane==null){
            try{
                this.yealryExpenditureAnchorPane = new FXMLLoader(getClass().getResource("/Admin/YearlyChartExpenditure.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } return  yealryExpenditureAnchorPane;
    }



    private void createStage(FXMLLoader loader) {
        Scene scene = null;
        try{
              scene = new Scene(loader.load());
        } catch (Exception e){
            e.printStackTrace();
        }

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Diya Hastakala");
        stage.show();
    }

    public void showAdminWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Admin/Admin.fxml"));
        AdminController controller = new AdminController();
        loader.setController(controller);
        createStage(loader);
    }

    public void showWorkerWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/worker/Employee.fxml"));
        AdminController controller = new AdminController();
        loader.setController(controller);
        createStage(loader);
    }

    public void setLogInAccountType(AccountType value) {
        this.accountType = value;
    }
    public  void closeStage(Stage stage){
        stage.close();
    }
}
