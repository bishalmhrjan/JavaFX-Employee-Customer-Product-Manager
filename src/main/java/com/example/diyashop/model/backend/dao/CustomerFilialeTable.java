package com.example.diyashop.model.backend.dao;

import com.example.diyashop.model.backend.Customer;
import com.example.diyashop.model.backend.FilialeShop;

import java.util.UUID;

public class CustomerFilialeTable {
    private Customer customer;
    private FilialeShop filialeShop;
    private UUID customerFilialeShopID;
    private UUID customerFKID;
    private UUID filialeFKID;

    public CustomerFilialeTable(Customer customer, FilialeShop filialeShop) {
        this.customerFKID = customer.getCustomerId();
        this.filialeFKID = filialeShop.getFilialeID();
        this.customerFilialeShopID= UUID.randomUUID();
    }

    public Customer getCustomer() {
        return customer;
    }

    public FilialeShop getFilialeShop() {
        return filialeShop;
    }

    public UUID getCustomerFilialeShopID() {
        return customerFilialeShopID;
    }

    public UUID getCustomerFKID() {
        return customerFKID;
    }

    public UUID getFilialeFKID() {
        return filialeFKID;
    }
}
