package com.example.diyashop.model;

import com.example.diyashop.view.AccountType;
import com.example.diyashop.view.ViewFactory;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Model {

    private  static  Model model;
    private final ViewFactory viewFactory;

    private final DatabaseDriver database;

    private final boolean employeeLoginSuccess;

    private final boolean adminLogInSuccess;



    private Model(){
        this.employeeLoginSuccess= false;
        this.adminLogInSuccess = false;
        this.viewFactory = new ViewFactory();
        this.database = new DatabaseDriver();
    }



    public static synchronized Model getInstance(){

        if(model==null){
            model = new Model();
        }
        return  model;
    }


    public ViewFactory getViewFactory() {
        return viewFactory;
    }

    public DatabaseDriver getDatabase() {
        return database;
    }

    public void evaluateCredential(AccountType accountType,String username, String password) {
        ResultSet resultSet = null;
        if (accountType == AccountType.ADMIN) {
            resultSet = database.getAdmitData(username, password);
            try {
                while (resultSet.next()) {

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            if (accountType == AccountType.EMPLOYEE) {
                resultSet = database.getWorkerData(username, password);
                try {
                    while (resultSet.next()) {

                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
