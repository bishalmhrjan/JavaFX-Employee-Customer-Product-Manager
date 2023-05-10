package com.example.diyashop.model;

import java.sql.*;

public class DatabaseDriver {
private Connection connection;

    public DatabaseDriver(){


        try{
            this.connection = DriverManager.getConnection("jdbc:sqlite:diyadesktop.db");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }


        public ResultSet getAdmitData(String username, String password){


            Statement statement = null;
            ResultSet resultSet = null;
            try{
                statement = this.connection.createStatement();
                resultSet = statement.executeQuery("select * from Admin where username='"+username+"' and Password='"+password+"';");
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
                resultSet = statement.executeQuery("select * from Employee where username='"+username+"' and Password='"+password+"';");
            }catch (SQLException e){
                e.printStackTrace();
            }
            return  resultSet;
        }


}
