package com.example.diyashop.controller.admin;

import com.example.diyashop.controller.employee.EmployeeDao;

import java.util.List;
import java.util.Optional;

public class AdminEmployeeManagementService {

 private final EmployeeDao employeeDao;


    public AdminEmployeeManagementService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee>  getAllEmployee(){
        return employeeDao.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id){
        return employeeDao.findById(id);
    }

    public void updateEmployeeRole(){
        // TO DO

    }

    public void updateEmployee(){

    }
}
