package com.example.diyashop.model.backend.dao;

import com.example.diyashop.model.DatabaseDriver;
import com.example.diyashop.model.backend.Country;
import com.example.diyashop.model.backend.Customer;
import com.example.diyashop.model.backend.Occupation;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements GenericDAO<Customer>{
    private Connection connection;

    public CustomerDAO(DatabaseDriver driverManager) {
        this.connection = driverManager.getConnection();
    }
    @Override
    public void add(Customer customer) {
        String sql = "INSERT INTO customers (first_name, last_name, user_name, date_of_birth, sex, residence, nationality, occupation) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, customer.getFirstName());
            statement.setString(2, customer.getLastName());
            statement.setString(3, customer.getUserName());
            statement.setDate(4, new java.sql.Date(customer.getDateOfBirth().getTime()));
            statement.setString(5, customer.getSex());
            statement.setString(6, customer.getResidence().name()); // Use enum's name
            statement.setString(7, customer.getNationality().name()); // Use enum's name
            statement.setString(8, customer.getOccupation().toString()); // Assuming Occupation is not an enum
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Customer getById(String userName) {
        String sql = "SELECT * FROM customers WHERE user_name = ?";
        Customer customer = null;

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, userName);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                customer = new Customer();
                customer.setFirstName(resultSet.getString("first_name"));
                customer.setLastName(resultSet.getString("last_name"));
                customer.setUserName(resultSet.getString("user_name"));
                customer.setDateOfBirth(resultSet.getDate("date_of_birth"));
                customer.setSex(resultSet.getString("sex"));
                customer.setResidence(Country.valueOf(resultSet.getString("residence"))); // Convert String to enum
                customer.setNationality(Country.valueOf(resultSet.getString("nationality"))); // Convert String to enum
                customer.setOccupation(  Occupation.valueOf(resultSet.getString("occupation"))); // Assuming Occupation is a class

                // Handle receipts separately
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customer;
    }

    @Override
    public void update(Customer customer) {
        String sql = "UPDATE customers SET first_name = ?, last_name = ?, date_of_birth = ?, sex = ?, residence = ?, nationality = ?, occupation = ? WHERE user_name = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, customer.getFirstName());
            statement.setString(2, customer.getLastName());
            statement.setDate(3, new java.sql.Date(customer.getDateOfBirth().getTime()));
            statement.setString(4, customer.getSex());
            statement.setString(5, customer.getResidence().name()); // Use enum's name
            statement.setString(6, customer.getNationality().name()); // Use enum's name
            statement.setString(7, customer.getOccupation().toString()); // Assuming Occupation is not an enum
            statement.setString(8, customer.getUserName());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String userName) {
        String sql = "DELETE FROM customers WHERE user_name = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, userName);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<>();
        String sql = "SELECT * FROM customers";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Customer customer = new Customer();
                customer.setFirstName(resultSet.getString("first_name"));
                customer.setLastName(resultSet.getString("last_name"));
                customer.setUserName(resultSet.getString("user_name"));
                customer.setDateOfBirth(resultSet.getDate("date_of_birth"));
                customer.setSex(resultSet.getString("sex"));
                customer.setResidence(Country.valueOf(resultSet.getString("residence"))); // Convert String to enum
                customer.setNationality(Country.valueOf(resultSet.getString("nationality"))); // Convert String to enum
                customer.setOccupation(  Occupation.valueOf(resultSet.getString("occupation"))); // Assuming Occupation is a class

                customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customers;
    }
}