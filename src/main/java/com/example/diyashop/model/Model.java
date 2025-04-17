package com.example.diyashop.model;

import com.example.diyashop.view.AccountType;
import com.example.diyashop.view.AdminViewFactory;
import com.example.diyashop.view.CommonViewFactory;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Model {

    private static Model model;
    private  final CommonViewFactory viewFactory;

    private  final AdminViewFactory adminViewFactory;


    private final DatabaseDriver database;
    private final EmployeeModel employeeModel;
    private boolean clientLogInSuccessFlag;


    private boolean adminLogInSuccess;

    public boolean isAdminLogInSuccess() {
        return adminLogInSuccess;
    }

    public boolean isEmployeeLogInSuccess() {
        return employeeLogInSuccess;
    }

    private boolean employeeLogInSuccess;


    private Model() {
        this.employeeLogInSuccess = false;
        this.adminLogInSuccess = false;
        this.viewFactory = new CommonViewFactory();
        this.database = new DatabaseDriver();
        this.employeeModel = new EmployeeModel(0, "", "");
        this.adminViewFactory = new AdminViewFactory();

    }


    public static synchronized Model getInstance() {

        if (model == null) {
            model = new Model();
        }
        return model;
    }


    public CommonViewFactory getViewFactory() {
        return viewFactory;
    }

    public DatabaseDriver getDatabase() {
        return database;
    }

    public boolean evaluateCredential(AccountType accountType, String username, String password) {
        ResultSet resultSet = null;
        String usernameInDatabase = "";
        String passwordInDatabase = "";


        if (accountType == AccountType.ADMIN) {
            resultSet = database.getAdmitData(username, password);
            try {
                while (resultSet.next()) {
                    usernameInDatabase = resultSet.getString("Username");
                    passwordInDatabase = resultSet.getString("Password");

                    if (username.equals(usernameInDatabase) && password.equals(passwordInDatabase)) {
                        this.adminLogInSuccess = true;
                        return adminLogInSuccess;
                    }


                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Close the resources in the reverse order of their creation (ResultSet first, then Statement).
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                        // Handle the exception appropriately.
                    }
                }

            }
        } else {
            if (accountType == AccountType.EMPLOYEE) {
                resultSet = database.getWorkerData(username, password);
                try {
                    while (resultSet.next()) {

                        usernameInDatabase = resultSet.getString("Username");
                        passwordInDatabase = resultSet.getString("Password");
                        if (username.equals(usernameInDatabase) && password.equals(passwordInDatabase)) {
                            this.employeeLogInSuccess = true;
                            return employeeLogInSuccess;
                        }


                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    // Close the resources in the reverse order of their creation (ResultSet first, then Statement).
                    if (resultSet != null) {
                        try {
                            resultSet.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                            // Handle the exception appropriately.
                        }
                    }

                }
            }

        }

        return false;
    }
    public AdminViewFactory getAdminViewFactory() {
        return adminViewFactory;
    }


}
