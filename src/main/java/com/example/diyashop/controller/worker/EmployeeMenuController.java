package com.example.diyashop.controller.worker;

import com.example.diyashop.model.Model;
import com.example.diyashop.view.AdminOptionView;
import com.example.diyashop.view.EmployeeOptionView;
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
    @FXML public Button search;

    public Button getReceipt() {
        return receipt;
    }

    public Button getSearch() {
        return search;
    }
    public Button getLogOut() {
        return logOut;
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.getReceipt().setOnAction(e -> onRecieptClicked());
        this.getSearch().setOnAction(e -> onSearchClicked());
        this.getLogOut().setOnAction(e->onLogOutClick());

    }

    public void onRecieptClicked() {
        Model.getInstance().getViewFactory().getWorkerOptionViewObjectProperty().set(EmployeeOptionView.RECIEPT);
        ;
    }


    public void onSearchClicked() {
        Model.getInstance().getViewFactory().getWorkerOptionViewObjectProperty().set(EmployeeOptionView.SEARCH);
    }
    public void onLogOutClick(){
        ((Stage)logOut.getScene().getWindow()).close();
    }

}
