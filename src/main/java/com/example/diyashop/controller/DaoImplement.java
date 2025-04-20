package com.example.diyashop.controller;

import com.example.diyashop.controller.admin.Employee;

import java.util.List;
import java.util.Optional;

public interface DaoImplement<T> {
    List<Employee> findAll();
    Optional<T> findById(Long  id);

    void save(T t);

    void update(T t);
    void delete(Long id);
}
