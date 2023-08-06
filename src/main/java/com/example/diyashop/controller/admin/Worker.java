package com.example.diyashop.controller.admin;

public class Worker {
    private String firstName;
    private String lastName;

    private  boolean adminRight;


    public Worker(String firstName, String lastName, boolean adminRight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adminRight = adminRight;
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
