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
        this.adminViewFactory = new AdminViewFactory();

    }


    public static synchronized Model getInstance() {

        if (model == null) {
            model = new Model();
        }
        return model;
    }


    public CommonViewFactory getCommonViewFactory() {
        return viewFactory;
    }

    public DatabaseDriver getDatabase() {
        return database;
    }

    public boolean evaluateCredential(AccountType accountType, String username, String password) throws SQLException {
        ResultSet resultSet = null;
        String usernameInDatabase = "";
        String passwordInDatabase = "";


        if (accountType == AccountType.ADMIN) {
            resultSet = database.getAdminData(username, password);
// Remove this line: System.out.println("admin result set has datas "+resultSet.next());

            try {
                if (resultSet.next()) {  // Changed from while to if if you only expect one row
                    usernameInDatabase = resultSet.getString("username");
                    passwordInDatabase = resultSet.getString("password");


                    if (username.equals(usernameInDatabase) && password.equals(passwordInDatabase)) {
                        this.adminLogInSuccess = true;
                        System.out.println("admin login is "+adminLogInSuccess);
                        return true;
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
                    if (resultSet.next()) {

                        usernameInDatabase = resultSet.getString("username");
                        passwordInDatabase = resultSet.getString("password");


                        if (username.equals(usernameInDatabase) && password.equals(passwordInDatabase)) {
                            this.employeeLogInSuccess = true;
                            System.out.println("employee login is "+employeeLogInSuccess);

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
