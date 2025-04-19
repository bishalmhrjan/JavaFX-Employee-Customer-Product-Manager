package com.example.diyashop.controller;

import com.example.diyashop.controller.admin.Employee;

import java.util.List;
import java.util.Optional;

public interface UserRepository<T> {
    List<Employee> findAll();
    Optional<T> findById(int id);

    void save(T t);
    void updateRoles(int id, List<String> roles);
}
