package com.example.diyashop.controller;

import com.example.diyashop.model.Model;
import com.example.diyashop.view.AccountType;
import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LogInController implements Initializable {
    private ChoiceBox<AccountType> chooseAccountType;
    private TextField userName;
    private TextField password;
    private Button logInButton;
    private Label userNameLabel;
    private Label passwordLabel;

    public ChoiceBox<AccountType> getChooseAccountType() {
        return chooseAccountType;
    }

    public TextField getUserName() {
        return userName;
    }

    public TextField getPassword() {
        return password;
    }

    public Button getLogInButton() {
        return logInButton;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    chooseAccountType.setItems(FXCollections.observableArrayList(AccountType.EMPLOYEE,AccountType.ADMIN));
    chooseAccountType.setValue(Model.getInstance().getViewFactory().getAccountType());
    chooseAccountType.valueProperty().addListener(e->setChooseAccountType());
    logInButton.setOnAction(e->onLogIn());
    }

    private void onLogIn() {
        Stage stage =(Stage) passwordLabel.getScene().getWindow();
        if(Model.getInstance().getViewFactory().getAccountType()==AccountType.EMPLOYEE){
                Model.getInstance().evaluateCredential(AccountType.EMPLOYEE, this.getUserName().getText(),this.getPassword().getText());
        } else{
            if(Model.getInstance().getViewFactory().getAccountType()==AccountType.ADMIN){
                Model.getInstance().evaluateCredential(AccountType.ADMIN, this.getUserName().getText(),this.getPassword().getText());

            }
        }

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
