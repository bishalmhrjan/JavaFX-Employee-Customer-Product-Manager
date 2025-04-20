package com.example.diyashop.controller.dao;

import com.example.diyashop.controller.admin.Admin;
import com.example.diyashop.controller.admin.Employee;

import java.util.List;

public class EmployeeDao extends JpaDao<Employee> implements GenericDao<Employee> {
    @Override
    public Employee create(Employee employee) {
        return super.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return super.update(employee);
    }

    @Override
    public Employee get(Object id) {
        return null;
    }

    @Override
    public void delete(Object id) {
          super.find(Employee.class,id);

    }

    @Override
    public List<Employee> listAll() {
        return super.findWithNamedQuery("Employee.findAll()");
    }

    @Override
    public long count() {
        return super.countWithNamedQuery("Employee.countAll()");
    }
}
