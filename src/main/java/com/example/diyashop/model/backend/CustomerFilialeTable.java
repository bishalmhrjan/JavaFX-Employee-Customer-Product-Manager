package com.example.diyashop.model.backend;

import com.example.diyashop.model.entity.Customer;

import java.util.UUID;
import javax.persistence.*;


@Entity
@Table(name = "customer_filiale_table")
public class CustomerFilialeTable {

    @Id
    @Column(name = "customer_filiale_id", nullable = false, columnDefinition = "CHAR(36)")
    private String customerFilialeId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "filiale_id", nullable = false)
    private FilialeShop filialeShop;

    // Constructor, getters, and setters...


    public CustomerFilialeTable() {
        this.customerFilialeId= UUID.randomUUID().toString();
    }

    // Constructor
    public CustomerFilialeTable(Customer customer, FilialeShop filialeShop) {
        this.customerFilialeId = UUID.randomUUID().toString();
        this.customer = customer;
        this.filialeShop = filialeShop;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setFilialeShop(FilialeShop filialeShop) {
        this.filialeShop = filialeShop;
    }
    // Getters and Setters...
}