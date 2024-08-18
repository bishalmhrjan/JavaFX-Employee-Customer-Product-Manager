package com.example.diyashop.model.backend.dao;

import com.example.diyashop.model.DatabaseDriver;
import com.example.diyashop.model.backend.Product;
import com.example.diyashop.model.DatabaseDriver;
import com.example.diyashop.model.backend.Country;
import com.example.diyashop.model.backend.Customer;
import com.example.diyashop.model.backend.Occupation;
import com.example.diyashop.model.productstype.ProductEnum;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class ProductDAO implements GenericDAO<Product> {

    private Connection connection;

    public ProductDAO(DatabaseDriver driverManager) {
        this.connection = driverManager.getConnection();
    }

    @Override
    public void add(Product product) {
        String sql = "INSERT INTO products (product_id, product_name, product_type) VALUES (?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, product.getProduct_id());
            statement.setString(2, product.getProductName().name());
            statement.setString(3, product.getProductType().name());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Product getById(String product_id) {
        String sql = "SELECT * FROM products WHERE product_id = ?";
        Product product = null;

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, product_id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                ProductEnum productName = ProductEnum.valueOf(resultSet.getString("product_name"));
                ProductEnum.ProductType productType = ProductEnum.ProductType.valueOf(resultSet.getString("product_type"));
                product = new Product(productName, productType, resultSet.getString("product_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return product;
    }

    @Override
    public void update(Product product) {
        String sql = "UPDATE products SET product_name = ?, product_type = ? WHERE product_id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, product.getProductName().name());
            statement.setString(2, product.getProductType().name());
            statement.setString(3, product.getProduct_id());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String product_id) {
        String sql = "DELETE FROM products WHERE product_id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, product_id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM products";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                ProductEnum productName = ProductEnum.valueOf(resultSet.getString("product_name"));
                ProductEnum.ProductType productType = ProductEnum.ProductType.valueOf(resultSet.getString("product_type"));
                String product_id = resultSet.getString("product_id");

                Product product = new Product(productName, productType, product_id);
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
    }
}