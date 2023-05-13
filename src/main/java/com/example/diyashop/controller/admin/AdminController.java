package com.example.diyashop.controller.admin;

import com.example.diyashop.controller.CommonController;
import com.example.diyashop.model.Model;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminController extends CommonController {
    @FXML private BorderPane adminParent;

    public BorderPane getAdminParent() {
        return adminParent;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().addListener((observableValue, oldValue, newValue) ->{
            switch (newValue){
                case ADD_PRODUCT -> this.getAdminParent().setCenter(Model.getInstance().getViewFactory().getAddProductAnchorPane());
                case STATE_OF_PRODUCTS ->this.getAdminParent().setCenter(Model.getInstance().getViewFactory().getStateOfProductsAnchorPane());
                 // charts
                case DAILY_VIEW -> this.getAdminParent().setCenter(Model.getInstance().getViewFactory().getDailyViewAnchorPane());
                case WEEKLY_VIEW -> this.getAdminParent().setCenter(Model.getInstance().getViewFactory().getWeeklyViewAnchorPane());
                case MOTHLY_VIEW -> this.getAdminParent().setCenter(Model.getInstance().getViewFactory().getMonthlyViewAnchorPane());
                case QUATERLY_VIEW -> this.getAdminParent().setCenter(Model.getInstance().getViewFactory().getQuaterlyViewAnchorPane());
                case HALF_YEARLY_VIEW -> this.getAdminParent().setCenter(Model.getInstance().getViewFactory().getHalfYearlyViewAnchorPane());
                case YEARLY_VIEW -> this.getAdminParent().setCenter(Model.getInstance().getViewFactory().getYearlyViewAnchorPane());
                // expenditure
                case DAILY_EXPENDITURE -> this.getAdminParent().setCenter(Model.getInstance().getViewFactory().getDailyExpenditureAnchorPane());
                case WEEKLY_EXPENDITURE -> this.getAdminParent().setCenter(Model.getInstance().getViewFactory().getWeeklyExpenditureAnchorPane());
                case MONTHLY_EXPENDITURE -> this.getAdminParent().setCenter(Model.getInstance().getViewFactory().getMonthlyExpenditureAnchorPane());
                case QUARTERLY_EXPENDITURE -> this.getAdminParent().setCenter(Model.getInstance().getViewFactory().getQuaterlyExpenditureAnchorPane());
                case HALF_YEARLY_EXPENDITURE -> this.getAdminParent().setCenter(Model.getInstance().getViewFactory().getHalfYealryExpenditureAnchorPane());
                case YEARLY_EXPENDITURE -> this.getAdminParent().setCenter(Model.getInstance().getViewFactory().getYealryExpenditureAnchorPane());

                default ->   this.getAdminParent().setCenter(Model.getInstance().getViewFactory().getSearchAnchorPane());

            }
        } );
    }
}
