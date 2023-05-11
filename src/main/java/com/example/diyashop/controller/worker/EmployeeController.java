package com.example.diyashop.controller.worker;

import com.example.diyashop.controller.CommonController;
import com.example.diyashop.model.Model;
import com.example.diyashop.view.AdminOptionView;
import com.example.diyashop.view.WorkerOptionView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeController implements Initializable {
    public BorderPane getBorderPane() {
        return borderPane;
    }

    @FXML private BorderPane borderPane;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().addListener((observable,oldvalue,nevalue)->{
            switch (nevalue){
                case RECIEPT ->Model.getInstance().getViewFactory().getWorkerOptionViewObjectPropertyProperty().set(WorkerOptionView.RECIEPT);
                case STATE_OF_PRODUCTS -> Model.getInstance().getViewFactory().getWorkerOptionViewObjectPropertyProperty().set(WorkerOptionView.STATE_OF_PRODUCTS) ;
                     default->    Model.getInstance().getViewFactory().getWorkerOptionViewObjectPropertyProperty().set(WorkerOptionView.SEARCH);

            }
        });
    }
}
