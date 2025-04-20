package com.example.diyashop.controller.employee;

import com.example.diyashop.controller.DaoImplement;
import com.example.diyashop.controller.admin.Employee;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public class EmployeeDao implements DaoImplement<Employee> {


    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Employee employee) {

    }


    public void updateRoles(int id, List<String> roles) {

    }

    @Override public void update(Employee employee) {
    }

    @Override  public void delete(Long id) {

    }
}
