package com.example.diyashop.controller.admin;

import com.example.diyashop.model.backend.FilialeShop;

public class Admin extends Worker{

    public Admin(String firstName, String lastName, boolean adminRight, FilialeShop filialeShop) {
        super(firstName, lastName, adminRight, filialeShop);
    }
}
