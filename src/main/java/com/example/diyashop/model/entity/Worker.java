package com.example.diyashop.model.entity;

import com.example.diyashop.model.backend.FilialeShop;


import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "worker")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Worker {

    @Id
    @Column(name = "worker_id", updatable = false, nullable = false, columnDefinition = "CHAR(36)")
    private String workerId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;



    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "filiale_id", nullable = false)
    private FilialeShop filialeShop;


    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public FilialeShop getFilialeShop() {
        return filialeShop;
    }

    public void setFilialeShop(FilialeShop filialeShop) {
        this.filialeShop = filialeShop;
    }
}
