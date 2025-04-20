package com.example.diyashop.controller.employee;

import com.example.diyashop.model.Model;
import com.example.diyashop.view.CommonOptionView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeMenuController implements Initializable {
    @FXML
    public Button receipt;
    @FXML
    public Button logOut;
    @FXML
    public Button search;

    @FXML
    public Button productDetails;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("EmployeeMenuController initialize() called!");

        this.getReceipt().setOnAction(e -> onRecieptClicked());
        this.getSearch().setOnAction(e -> onSearchClicked());
        this.getLogOut().setOnAction(e->onLogOutClick());
        this.getProductDetails().setOnAction(e->onProductDetailsClicked());

    }
    public Button getReceipt() {
        return receipt;
    }

    public Button getSearch() {
        return search;
    }
    public Button getLogOut() {
        return logOut;
    }

    public Button getProductDetails() {
        return productDetails;
    }

    public void onRecieptClicked() {
        System.out.println("onReceipt method got called");
        Model.getInstance().getCommonViewFactory().getCommonOptionViewObjectProperty().set(CommonOptionView.RECIEPT);
        System.out.println("method ends");
    }
    public void onProductDetailsClicked() {
        System.out.println("onState of Product method got called");


        Model.getInstance().getCommonViewFactory().getCommonOptionViewObjectProperty().set(CommonOptionView.PRODUCT_DETAILS);
    }

    public void onSearchClicked() {
        System.out.println("onsearch method got called");

        Model.getInstance().getCommonViewFactory().getCommonOptionViewObjectProperty().set(CommonOptionView.SEARCH);
    }
    public void onLogOutClick(){
        ((Stage)logOut.getScene().getWindow()).close();
    }

}
