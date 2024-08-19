package com.example.diyashop.model.backend;

import com.example.diyashop.model.productstype.ProductEnum;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Reciept {


    private Customer customer;
    private  FilialeShop filialeShop;
    private UUID customerFKID;

    private UUID filialeFKID;
    private double totalAmount;

    private Date date;

    private UUID recieptID;


    public Reciept(Customer customer, FilialeShop filialeShop, double totalAmount, Date date) {
        this.customerFKID = customer.getCustomerId();
        this.filialeFKID = filialeShop.getFilialeID();
        this.totalAmount = totalAmount;
        this.date = date;
        this.recieptID =UUID.randomUUID();
    }

    public Customer getCustomer() {
        return customer;
    }

    public FilialeShop getFilialeShop() {
        return filialeShop;
    }

    public UUID getCustomerFKID() {
        return customerFKID;
    }

    public UUID getFilialeFKID() {
        return filialeFKID;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public Date getDate() {
        return date;
    }

    public UUID getRecieptID() {
        return recieptID;
    }

 }