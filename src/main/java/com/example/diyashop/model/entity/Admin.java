package com.example.diyashop.model.entity;

import com.example.diyashop.controller.admin.Role;

import jakarta.persistence.*;

@Entity
@Table(name = "admin")
@PrimaryKeyJoinColumn(name = "worker_id")

public class Admin extends Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Role admin = Role.ADMIN;


    public Role getAdmin() {
        return admin;
    }

    public void setAdmin(Role admin) {
        this.admin = admin;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}