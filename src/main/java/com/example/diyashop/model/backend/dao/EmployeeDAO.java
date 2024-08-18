package com.example.diyashop.model.backend.dao;

import com.example.diyashop.controller.admin.Employee;
import com.example.diyashop.model.DatabaseDriver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO implements GenericDAO<Employee> {

    private Connection connection;

    public EmployeeDAO(DatabaseDriver databaseDriver) {
        this.connection = databaseDriver.getConnection();
    }

    @Override
    public void add(Employee employee) {
        String sql = "INSERT INTO employees (employee_id, first_name, last_name, admin_right) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, employee.getId()); // Set employee ID
            statement.setString(2, employee.getFirstName()); // Set first name
            statement.setString(3, employee.getLastName()); // Set last name
            statement.setBoolean(4, employee.isAdminRight()); // Set admin rights

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately in a real application
        }
    }

    @Override
    public Employee getById(String id) {
        String sql = "SELECT * FROM employees WHERE employee_id = ?";
        Employee employee = null;

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                boolean adminRight = resultSet.getBoolean("admin_right");
                String employeeId = resultSet.getString("employee_id");

                employee = new Employee(firstName, lastName, adminRight, employeeId);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately in a real application
        }

        return employee;
    }

    @Override
    public void update(Employee employee) {
        String sql = "UPDATE employees SET first_name = ?, last_name = ?, admin_right = ? WHERE employee_id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, employee.getFirstName()); // Update first name
            statement.setString(2, employee.getLastName()); // Update last name
            statement.setBoolean(3, employee.isAdminRight()); // Update admin rights
            statement.setString(4, employee.getId()); // Identify by employee ID

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately in a real application
        }
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM employees WHERE employee_id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, id); // Identify by employee ID
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately in a real application
        }
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM employees";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                boolean adminRight = resultSet.getBoolean("admin_right");
                String employeeId = resultSet.getString("employee_id");

                Employee employee = new Employee(firstName, lastName, adminRight, employeeId);
                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately in a real application
        }

        return employees;
    }
}