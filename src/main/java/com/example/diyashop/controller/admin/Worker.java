package com.example.diyashop.controller.admin;

import com.example.diyashop.model.backend.FilialeShop;

import java.util.UUID;

public class Worker {
    private String firstName;
    private String lastName;

    private  boolean adminRight;
    private String id;

    private FilialeShop filialeShop;

    private UUID filialeShopFKID;



    public Worker(String firstName, String lastName, boolean adminRight,FilialeShop filialeShop) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adminRight = adminRight;
        this.filialeShopFKID =filialeShop.getFilialeID();
        this.id = id;
    }
    public FilialeShop getFilialeShop() {
        return filialeShop;
    }

    public UUID getFilialeShopFKID() {
        return filialeShopFKID;
    }
    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isAdminRight() {
        return adminRight;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAdminRight(boolean adminRight) {
        this.adminRight = adminRight;
    }
}
