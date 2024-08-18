package com.example.diyashop.controller.admin;

public class Worker {
    private String firstName;
    private String lastName;

    private  boolean adminRight;
    private String id;

    public Worker(String firstName, String lastName, boolean adminRight, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adminRight = adminRight;
        this.id = id;
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
