package com.example.diyashop.model.finance.expenditure;

import java.util.Date;

public class Expenditure {
    private double expenditure;
    private Date date;

    public Expenditure(double earning, Date date) {
        this.expenditure = earning;
        this.date = date;
    }

    public double getExpenditure() {
        return expenditure;
    }

    public Date getDate() {
        return date;
    }
}
