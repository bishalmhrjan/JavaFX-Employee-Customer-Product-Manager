package com.example.diyashop.controller;

import com.example.diyashop.model.Model;
import com.example.diyashop.view.CommonOptionView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class CommonMenuController implements Initializable {
    @FXML
    public Button receipt;
    @FXML public Button search;

    public Button getReceipt() {
        return receipt;
    }

    public Button getSearch() {
        return search;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.getReceipt().setOnAction(e -> onRecieptClicked());
        this.getSearch().setOnAction(e -> onSearchClicked());

    }

    public void onRecieptClicked() {
        Model.getInstance().getViewFactory().getWorkerOptionViewObjectProperty().set(CommonOptionView.RECIEPT);
        ;
    }
    public void onSearchClicked() {
        Model.getInstance().getViewFactory().getWorkerOptionViewObjectProperty().set(CommonOptionView.SEARCH);
    }


}
