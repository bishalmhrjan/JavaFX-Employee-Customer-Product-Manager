package com.example.diyashop.controller.admin;

import javax.persistence.Entity;

@Entity
public class Admin extends Worker {

private Role admin = Role.ADMIN;


    public Role getAdmin() {
        return admin;
    }

    public void setAdmin(Role admin) {
        this.admin = admin;
    }
}