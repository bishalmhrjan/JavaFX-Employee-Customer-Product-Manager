package com.example.diyashop.model.backend;

import com.example.diyashop.model.productstype.ProductEnum;

import java.util.ArrayList;
import java.util.Date;

public class Reciept {


    private double sum;

    private Date date;

    private int recieptID;


    public Reciept(double sum, Date date, int recieptID) {
        this.sum = sum;
        this.date = date;
        this.recieptID = recieptID;
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