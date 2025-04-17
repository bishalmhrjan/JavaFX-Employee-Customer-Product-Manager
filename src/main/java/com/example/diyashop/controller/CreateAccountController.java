package com.example.diyashop.controller;

import com.example.diyashop.model.Model;
import com.example.diyashop.view.AccountType;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateAccountController implements Initializable {

    @FXML
    public Label userNameLabel;
    @FXML
    public Label passwordLabel;
    @FXML
    public TextField userName;
    @FXML
    public PasswordField password;
    @FXML
    public Label passwordLabel1;
    @FXML
    public PasswordField confirmPassword;
    @FXML
    public Button createAccount;


    @FXML
    public ChoiceBox<AccountType> accountTypeChoiceBox;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.getAccountTypeChoiceBox().setItems(FXCollections.observableArrayList(AccountType.ADMIN, AccountType.EMPLOYEE));
        this.getAccountTypeChoiceBox().setValue(AccountType.ADMIN);

        this.getCreateAccount().setOnAction(e -> {
            try {
                System.out.println("inside try block");
                createAccount();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });

    }

    public PasswordField getConfirmPassword() {
        return confirmPassword;
    }

    public PasswordField getPassword() {
        return password;
    }

    public Button getCreateAccount() {
        return createAccount;
    }

    private void setCreateAccount() {

    }

    public ChoiceBox getAccountTypeChoiceBox() {
        return accountTypeChoiceBox;
    }

    public void createAccount() throws Exception {
        System.out.println("inside createmethod in createcontroller class "+Model.getInstance().getViewFactory().getAccountType().name());
        if (getAccountTypeChoiceBox().getValue() == AccountType.EMPLOYEE) {
            System.out.println("inside admin type in create account method");

            Model.getInstance().getDatabase().createNewUser(userName.getText(), password.getText(), confirmPassword.getText(), AccountType.EMPLOYEE);
        } else {

            if (getAccountTypeChoiceBox().getValue()  == AccountType.ADMIN) {
               Model.getInstance().getDatabase().createNewUser(userName.getText(), password.getText(), confirmPassword.getText(), AccountType.ADMIN);
             }
        }
    }

}
