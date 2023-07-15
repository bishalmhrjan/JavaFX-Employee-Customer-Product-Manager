package com.example.diyashop.model;

import java.sql.*;

public class DatabaseDriver {
private Connection connection;
private final String CONNECTION="jdbc:sqlite:diyadesktop.db";

    private final String ADMIN_QUERY_USERNAME="select * from Admin where username='";
    private final String EMPLOYEE_QUERY_USERNAME="select * from Employee where username='";
    private final String PASSWORDS ="' and Password='";
    public DatabaseDriver(){


        try{
            this.connection = DriverManager.getConnection(CONNECTION);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }


        public ResultSet getAdmitData(String username, String password){


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


}
