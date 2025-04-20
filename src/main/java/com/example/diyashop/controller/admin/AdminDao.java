package com.example.diyashop.controller.admin;

import com.example.diyashop.controller.DaoImplement;

import java.util.List;
import java.util.Optional;

public class AdminDao implements DaoImplement<Admin> {
    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Optional<Admin> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Admin admin) {

    }

    @Override
    public void update(Admin admin) {

    }

    @Override
    public void delete(Long id) {

    }
}
