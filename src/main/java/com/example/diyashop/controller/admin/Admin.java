package com.example.diyashop.controller.admin;

public class Admin extends Worker{
    public Admin(String firstName, String lastName, boolean adminRight) {
        super(firstName, lastName, adminRight);
        super.setAdminRight(true);
    }
}
