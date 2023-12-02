package com.example.diyashop.model.backend;

import com.example.diyashop.model.productstype.ProductEnum;

import java.util.ArrayList;
import java.util.Date;

public class Reciept {


    private double sum;

    private Date date;

    private int recieptID;

    private int customer_fk_id;

    public Reciept(double sum, Date date, int recieptID, int customer_fk_id) {
        this.sum = sum;
        this.date = date;
        this.recieptID = recieptID;
        this.customer_fk_id = customer_fk_id;
    }

    public int getCustomer_fk_id() {
        return customer_fk_id;
    }

    public double getSum() {
        return sum;
    }

    public Date getDate() {
        return date;
    }

    public int getRecieptID() {
        return recieptID;
    }
}