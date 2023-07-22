package com.example.diyashop.view;

import com.example.diyashop.controller.admin.AdminController;
import com.example.diyashop.model.productstype.Product;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX; // Import the BootstrapFX class

import java.io.IOException;

public class ViewFactory {

    private final String RECIEPT_ANCHORPANE="/Reciept.fxml";
    private final String SEARCH_PRODUCT_ANCHORPANE="/SearchProduct.fxml";
    private final String ANMELDUNG_DIALOG="/Anmelde.fxml";
    private final String ADD_PRODUCT_ANCHORPANE="/Admin/AddProduct.fxml";
    private final String STATE_OF_PRODUCTS_ANCHORPANE="/Admin/StateOfProducts.fxml";
    private final String DAILYCHART_ANCHORPANE="/Admin/DailyChart.fxml";
    private final String MONTHLYCHART_ANCHORPANE="/Admin/MonthlyChart.fxml";
    private final String QUATERLYCHART_ANCHORPANE="/Admin/QuarterlyChart.fxml";
    private final String HALFYEARLY_ANCHORPANE="/Admin/HalfYearlyChart.fxml";
    private final String YEARLY_ANCHORPANE="/Admin/YearlyChart.fxml";
    private final String DAILY_EXPENDITURE="/Admin/DailyExpenditure.fxml";
    private final String WEEKLYCHART_EXPENDITURE="/Admin/WeeklyChartExpenditure.fxml";
    private final String MONTHLYCHART_EXPENDITURE="/Admin/MonthlyChart.fxml";
    private final String WEEKLYCHART_ANCHORPANE="/Admin/WeeklyChart.fxml";
    private final String QUATERLYCHART_EXPENDITURE="/Admin/QuarterlyChartExpenditure.fxml";
    private final String HALFYEARLYCHART_EXPENDITURE="/Admin/HalfYearlyChartExpenditure.fxml";
    private final String COMMON_ANCHORPANE="/Common.fxml";

    private final String YEARLYCHART_EXPENDITURE="/Admin/YearlyChartExpenditure.fxml";
    private final String ADMIN_DIALOG="/Admin/Admin.fxml";

    private final String COMPANY_NAME="Diya Hastakala";



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
    private  Product product;

    private Product productType;





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
                this.recieptAnchorPane = new FXMLLoader(getClass().getResource(RECIEPT_ANCHORPANE)).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return recieptAnchorPane;
    }

    public AnchorPane getSearchAnchorPane() {
        if(this.searchAnchorPane==null){
            try{
                this.searchAnchorPane = new FXMLLoader(getClass().getResource(SEARCH_PRODUCT_ANCHORPANE)).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return searchAnchorPane;
    }


    public void showLogInWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(ANMELDUNG_DIALOG));
        createStage(loader);

    }

    public AnchorPane getAddProductAnchorPane() {
        if(this.addProductAnchorPane==null){
            try{
                this.addProductAnchorPane = new FXMLLoader(getClass().getResource(ADD_PRODUCT_ANCHORPANE)).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return addProductAnchorPane;
    }

    public AnchorPane getStateOfProductsAnchorPane() {
        if(this.stateOfProductsAnchorPane==null){
            try{
                this.stateOfProductsAnchorPane = new FXMLLoader(getClass().getResource(STATE_OF_PRODUCTS_ANCHORPANE)).load();
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
                this.dailyViewAnchorPane = new FXMLLoader(getClass().getResource(DAILYCHART_ANCHORPANE)).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return dailyViewAnchorPane;
    }
    public AnchorPane getMonthlyViewAnchorPane(){

        if(this.monthlyViewAnchorPane==null){
            try{
                this.monthlyViewAnchorPane = new FXMLLoader(getClass().getResource(MONTHLYCHART_ANCHORPANE)).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return monthlyViewAnchorPane;
    }

    public AnchorPane getWeeklyViewAnchorPane() {
        if(this.weeklyViewAnchorPane==null){
            try{
                this.weeklyViewAnchorPane = new FXMLLoader(getClass().getResource(WEEKLYCHART_ANCHORPANE)).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return weeklyViewAnchorPane;
    }

    public AnchorPane getQuaterlyViewAnchorPane() {
        if(this.quaterlyViewAnchorPane==null){
            try{
                this.quaterlyViewAnchorPane = new FXMLLoader(getClass().getResource(QUATERLYCHART_ANCHORPANE)).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return quaterlyViewAnchorPane;
    }

    public AnchorPane getHalfYearlyViewAnchorPane() {
        if(this.halfYearlyViewAnchorPane==null){
            try{
                this.halfYearlyViewAnchorPane = new FXMLLoader(getClass().getResource(HALFYEARLY_ANCHORPANE)).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return halfYearlyViewAnchorPane;
    }

    public AnchorPane getYearlyViewAnchorPane() {
        if(this.yearlyViewAnchorPane ==null){
            try{
                this.yearlyViewAnchorPane = new FXMLLoader(getClass().getResource(YEARLY_ANCHORPANE)).load();
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
                this.dailyExpenditureAnchorPane = new FXMLLoader(getClass().getResource(DAILY_EXPENDITURE)).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }  return dailyExpenditureAnchorPane;
    }

    public AnchorPane getWeeklyExpenditureAnchorPane() {
        if(this.weeklyExpenditureAnchorPane==null){
            try{
                this.weeklyExpenditureAnchorPane = new FXMLLoader(getClass().getResource(WEEKLYCHART_EXPENDITURE)).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } return weeklyExpenditureAnchorPane;
    }

    public AnchorPane getMonthlyExpenditureAnchorPane() {
        if(this.MonthlyExpenditureAnchorPane==null){
            try{
                this.MonthlyExpenditureAnchorPane = new FXMLLoader(getClass().getResource(MONTHLYCHART_EXPENDITURE)).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } return MonthlyExpenditureAnchorPane;
    }

    public AnchorPane getQuaterlyExpenditureAnchorPane() {
        if(this.quaterlyExpenditureAnchorPane==null){
            try{
                this.quaterlyExpenditureAnchorPane = new FXMLLoader(getClass().getResource(QUATERLYCHART_EXPENDITURE)).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } return quaterlyExpenditureAnchorPane;
    }

    public AnchorPane getHalfYealryExpenditureAnchorPane() {
        if(this.halfYealryExpenditureAnchorPane==null){
            try{
                this.halfYealryExpenditureAnchorPane = new FXMLLoader(getClass().getResource(HALFYEARLYCHART_EXPENDITURE)).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } return halfYealryExpenditureAnchorPane;
    }

    public AnchorPane getYealryExpenditureAnchorPane() {
        if(this.yealryExpenditureAnchorPane==null){
            try{
                this.yealryExpenditureAnchorPane = new FXMLLoader(getClass().getResource(YEARLYCHART_EXPENDITURE)).load();
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
        stage.setTitle(COMPANY_NAME);
        stage.show();
    }

    public void showAdminWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource(ADMIN_DIALOG));


        createStage(loader);
    }

    public void showWorkerWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource(COMMON_ANCHORPANE));


        createStage(loader);
    }

    public void setLogInAccountType(AccountType value) {
        this.accountType = value;
    }
    public  void closeStage(Stage stage){
        stage.close();
    }

    public Product getProductName() {

        return product;
    }

    public void setProduct(Product product) {

            this.product=product;

    }

    public void setProductType(Product value) {
        this.productType=productType;
    }
}
