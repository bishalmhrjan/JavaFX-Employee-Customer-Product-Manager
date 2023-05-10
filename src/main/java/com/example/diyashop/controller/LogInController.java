package com.example.diyashop.controller;

import com.example.diyashop.model.Model;
import com.example.diyashop.view.AccountType;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LogInController implements Initializable {
    private ChoiceBox<AccountType> chooseAccountType;
    private TextField userName;
    private TextField password;
    private Button logInButton;
    private Label userNameLabel;
    private Label passwordLabel;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    private  void setChooseAccountType(){

        if(chooseAccountType.getValue()==AccountType.ADMIN){
            userNameLabel.setText("Admin Username");
        } else if (chooseAccountType.getValue()==AccountType.EMPLOYEE) {
            userNameLabel.setText("Worker Username");

        }
        Model.getInstance().getViewFactory().setLogInAccountType(chooseAccountType.getValue());

    }
}
