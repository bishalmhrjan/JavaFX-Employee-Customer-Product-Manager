package com.example.diyashop.controller;

import com.example.diyashop.model.Model;
import com.example.diyashop.view.AccountType;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LogInController implements Initializable {


    @FXML
    public Label error_lbl;
    @FXML
    private ChoiceBox<AccountType> chooseAccountType;

    @FXML
    private TextField userName;

    @FXML
    private TextField password;
    @FXML
    private Button logInButton;

    @FXML
    private Label userNameLabel;

    @FXML
    private Label passwordLabel;

    public void setLogInButton(Button logInButton) {
        this.logInButton = logInButton;
    }
    public Button getLogInButton() {
        return logInButton;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    this.getChooseAccountType().setItems(FXCollections.observableArrayList(AccountType.EMPLOYEE,AccountType.ADMIN));
        this.getChooseAccountType().setValue(Model.getInstance().getViewFactory().getAccountType());
        this.getChooseAccountType().valueProperty().addListener(e->setChooseAccountType());
    this.getLogInButton().setOnAction(e->onLogIn());
    }

    private void onLogIn() {
        Stage stage = (Stage) passwordLabel.getScene().getWindow();
        boolean falschEmployee = true;
        boolean falschAdmin = true;
        if (Model.getInstance().getViewFactory().getAccountType() == AccountType.EMPLOYEE) {

            if (Model.getInstance().evaluateCredential(AccountType.EMPLOYEE, this.getUserName().getText(), this.getPassword().getText())) {

                Model.getInstance().getViewFactory().showWorkerWindow();
            } else {
                error_lbl.setText("Either wrong Benutzername or Password");
            }
        } else {

            if (Model.getInstance().getViewFactory().getAccountType() == AccountType.ADMIN) {

                if (Model.getInstance().evaluateCredential(AccountType.ADMIN, this.getUserName().getText(), this.getPassword().getText())) {
                    Model.getInstance().getViewFactory().showAdminWindow();

                } else {
                    error_lbl.setText("Keine Admin mit dieser Existiert");
                }
            }


        }
    }



    private  void setChooseAccountType(){
        Model.getInstance().getViewFactory().setLogInAccountType(chooseAccountType.getValue());

        if(chooseAccountType.getValue()==AccountType.ADMIN){
            userNameLabel.setText("Admin Username");
        } else if (chooseAccountType.getValue()==AccountType.EMPLOYEE) {
            userNameLabel.setText("Worker Username");

        }

    }
    public ChoiceBox<AccountType> getChooseAccountType() {
        return chooseAccountType;
    }

    public TextField getUserName() {
        return userName;
    }

    public TextField getPassword() {
        return password;
    }



    public void setChooseAccountType(ChoiceBox<AccountType> chooseAccountType) {
        this.chooseAccountType = chooseAccountType;
    }

    public void setUserName(TextField userName) {
        this.userName = userName;
    }

    public void setPassword(TextField password) {
        this.password = password;
    }


    public void setUserNameLabel(Label userNameLabel) {
        this.userNameLabel = userNameLabel;
    }

    public void setPasswordLabel(Label passwordLabel) {
        this.passwordLabel = passwordLabel;
    }

    public Label getError_lbl() {
        return error_lbl;
    }

    public void setError_lbl(Label error_lbl) {
        this.error_lbl = error_lbl;
    }
}
