package com.example.diyashop.controller.product;

import com.example.diyashop.controller.DaoImplement;
import com.example.diyashop.controller.admin.Employee;
import com.example.diyashop.model.backend.Product;

import java.util.List;
import java.util.Optional;

public class ProductDao implements DaoImplement<Product> {
    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Long id) {

    }
}
