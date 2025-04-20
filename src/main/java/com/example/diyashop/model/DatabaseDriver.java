package com.example.diyashop.model;

 import com.example.diyashop.model.productstype.ProductEnum;
import com.example.diyashop.view.AccountType;

import java.sql.*;

public class DatabaseDriver {
    private Connection connection;
    private static  AccountType accountType;
    private final String CONNECTION = "jdbc:sqlite:diyadesktop.db";

    private final String ADMIN_QUERY_USERNAME = "select * from Admin where username='";
    private final String EMPLOYEE_QUERY_USERNAME = "select * from Employee where username='";
    private final String PASSWORDS = "' and Password='";
    private final String INSERT_INTO_PRODUCT_In_TRACKER = "Insert into Product_In_Tracker(id,product_id_fk,unit,inStore,total,date,target_price) values(?,?,?,?,?,?,?)";

    private final String CREATE_NEW_AADMIN = "Insert into Admin(username,password) values(?,?) ";
    private final String CREATE_NEW_EMPLOYEE = "Insert into Employee(username,password) values(?,?) ";

    public DatabaseDriver() {


        try {

            this.connection = DriverManager.getConnection(CONNECTION);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


        public ResultSet getAdmitData(String username, String password)  {


            Statement statement = null;
            ResultSet resultSet = null;
            try{
                statement = this.connection.createStatement();
                resultSet = statement.executeQuery(ADMIN_QUERY_USERNAME+username+ PASSWORDS +password+"';");
            }catch (SQLException e){
                e.printStackTrace();
            }
            return  resultSet;
        }


    public ResultSet getWorkerData(String username, String password) {


        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = this.connection.createStatement();
            resultSet = statement.executeQuery(EMPLOYEE_QUERY_USERNAME + username + PASSWORDS + password + "';");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public void addProduct(ProductEnum productEnum, ProductEnum.ProductType productType, int stocks, double boughtPrice,
                           double targetPrice, double discountPercent, String date) {
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(INSERT_INTO_PRODUCT_In_TRACKER);
            preparedStatement.setString(1, productEnum.name());
            preparedStatement.setString(2, productType.name());
            preparedStatement.setInt(3, stocks);
            preparedStatement.setDouble(4, boughtPrice);
            preparedStatement.setDouble(5, targetPrice);
            preparedStatement.setDouble(6, discountPercent);
            preparedStatement.setString(7, date);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public   boolean createNewUser(String username, String firstPassword, String confirmPassword, AccountType accountType) throws Exception {
        if (firstPassword.equals(confirmPassword)) {
            System.out.println("-----------------before-if-true-------------------"+accountType.name());

            if (accountType == AccountType.ADMIN) {
                try {
                    PreparedStatement preparedStatement = this.connection.prepareStatement(CREATE_NEW_AADMIN);
                    preparedStatement.setString(1, username);
                    preparedStatement.setString(2, firstPassword);
                    //Model.getInstance().getDatabase
                    Model.getInstance().getCommonViewFactory().showLogInWindow();

                    /**
                     * getadmin data lai boolean banayera admin pw check garera matrai admin ko new account create garne.
                     *
                     */
                    preparedStatement.executeUpdate();

                  System.out.println("admin created successfully");
                } catch (SQLException ex) {
                   System.out.println( "admin created ???? "+ex.getLocalizedMessage());
                }
            } else {
                if (accountType == AccountType.EMPLOYEE) {
                    try {
                        PreparedStatement preparedStatement = this.connection.prepareStatement(CREATE_NEW_EMPLOYEE);
                        preparedStatement.setString(1, username);
                        preparedStatement.setString(2, firstPassword);
                        preparedStatement.executeUpdate();

                    } catch (SQLException ex) {

                        System.out.println("------------------inside catch section-------------------"+ ex.getLocalizedMessage());

                    }
                }


            }
            System.out.println("------------------true-------------------");

            return true;
        }
        System.out.println("------------------false-------------------");
        return false;

    }


    public Connection getConnection() {
        return connection;
    }

    public void closeConnection(){
        try{
            if(connection !=null && !connection.isClosed()){
                connection.close();
            }
        }catch (SQLException ex){
            ex.getLocalizedMessage();
        }
        }
}
