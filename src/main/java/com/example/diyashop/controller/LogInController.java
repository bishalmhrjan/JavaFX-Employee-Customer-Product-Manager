package com.example.diyashop.controller;

import com.example.diyashop.model.Model;
import com.example.diyashop.view.AccountType;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class LogInController implements Initializable {
    @FXML
    public Label error_lbl;
    @FXML public Hyperlink signUp;
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
        this.getChooseAccountType().setItems(FXCollections.observableArrayList(AccountType.EMPLOYEE, AccountType.ADMIN));
       this.getChooseAccountType().setValue(AccountType.ADMIN);
        this.getChooseAccountType().valueProperty().addListener(e -> setChooseAccountType());
        this.getSignUp().setOnAction(e->{
            Model.getInstance().getCommonViewFactory().createAccount();
        });
        this.getLogInButton().setOnAction(e -> {
            try {
                onLogIn();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    public boolean onLogIn() throws SQLException {
        //    Stage stage = (Stage) passwordLabel.getScene().getWindow();

        if (Model.getInstance().getCommonViewFactory().getAccountType() == AccountType.EMPLOYEE) {

            if (Model.getInstance().evaluateCredential(AccountType.EMPLOYEE, this.getUserName().getText(), this.getPassword().getText())) {

                Model.getInstance().getCommonViewFactory().showWorkerWindow();
                return true;
            } else {
                error_lbl.setText("Either wrong Benutzername or Password");
                return false;
            }
        } else {

            if (Model.getInstance().getCommonViewFactory().getAccountType() == AccountType.ADMIN) {

                if (Model.getInstance().evaluateCredential(AccountType.ADMIN, this.getUserName().getText(), this.getPassword().getText())) {
                    Model.getInstance().getCommonViewFactory().showAdminWindow();
                    return true;
                } else {
                    error_lbl.setText("Keine Admin mit dieser Existiert");
                    return false;
                }
            }
        }
        return false;
    }

    private void setChooseAccountType() {
        Model.getInstance().getCommonViewFactory().setLogInAccountType(chooseAccountType.getValue());

        if (chooseAccountType.getValue() == AccountType.ADMIN) {
            userNameLabel.setText("Admin Username");
        } else if (chooseAccountType.getValue() == AccountType.EMPLOYEE) {
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

    public Hyperlink getSignUp() {
        return signUp;
    }
}
