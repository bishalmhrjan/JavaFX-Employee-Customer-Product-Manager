package com.example.diyashop.model;

import com.example.diyashop.model.finance.PeriodTime;
import com.example.diyashop.model.productstype.Product;

import java.sql.*;

public class DatabaseDriver {
private Connection connection;
private final String CONNECTION="jdbc:sqlite:diyadesktop.db";

    private final String ADMIN_QUERY_USERNAME="select * from Admin where username='";
    private final String EMPLOYEE_QUERY_USERNAME="select * from Employee where username='";
    private final String PASSWORDS ="' and Password='";
    private final String INSERT_INTO_PRODUCT="Insert into ProductsDetail(product_name,product_type,stocks,bought_price,target_price,discount_percent,added_date) values(?,?,?,?,?,?,?)";
    public DatabaseDriver(){


        try{
            this.connection = DriverManager.getConnection(CONNECTION);
        } catch (SQLException e){
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


        public  ResultSet getWorkerData(String username, String password){


            Statement statement = null;
            ResultSet resultSet = null;
            try{
                statement = this.connection.createStatement();
                resultSet = statement.executeQuery(EMPLOYEE_QUERY_USERNAME+username+PASSWORDS+password+"';");
            }catch (SQLException e){
                e.printStackTrace();
            }
            return  resultSet;
        }

        public  void addProduct(Product product, Product.ProductType productType, int stocks, double boughtPrice,
                                double targetPrice, double discountPercent, PeriodTime periodTime){
          try{
              PreparedStatement preparedStatement = this.connection.prepareStatement(INSERT_INTO_PRODUCT);
              preparedStatement.setString(1, product.name());
              preparedStatement.setString(2, productType.name());
              preparedStatement.setInt(3,stocks);
              preparedStatement.setDouble(4,boughtPrice);
              preparedStatement.setDouble(5,targetPrice);
              preparedStatement.setDouble(6,discountPercent);
              preparedStatement.setString(7,periodTime.name());
              preparedStatement.executeUpdate();
          }catch (SQLException ex){
              ex.printStackTrace();
          }
        }

}
