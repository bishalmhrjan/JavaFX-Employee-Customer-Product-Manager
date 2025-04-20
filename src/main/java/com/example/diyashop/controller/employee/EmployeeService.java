package com.example.diyashop.controller.employee;

import com.example.diyashop.controller.admin.Employee;

import java.util.List;
import java.util.Optional;

public class EmployeeService {

    private final EmployeeDao employeeDao;


    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public Optional<Employee> getEmployeeById(Long id){
        return employeeDao.findById(id);
    }

    public void saveEmployee(Employee employee){
        employeeDao.save(employee);
    }
    public List<Employee> getAllEmployees(){
        return employeeDao.findAll();
    }

    public void updateEmployee(Employee employee){
        employeeDao.update(employee);
    }

    public void deleteEmployee(Long id){
        employeeDao.delete(id);
    }
}
