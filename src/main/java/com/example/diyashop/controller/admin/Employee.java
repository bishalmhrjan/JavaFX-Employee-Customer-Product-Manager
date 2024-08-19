package com.example.diyashop.controller.admin;

import com.example.diyashop.model.backend.FilialeShop;

public class Employee extends Worker{


    public Employee(String firstName, String lastName, boolean adminRight, FilialeShop filialeShop) {
        super(firstName, lastName, adminRight, filialeShop);
    }
}
