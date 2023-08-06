package com.example.diyashop.controller.admin;

public class Employee extends Worker{
    public Employee(String firstName, String lastName, boolean adminRight) {
        super(firstName, lastName, adminRight);
        super.setAdminRight(false);
    }
}
