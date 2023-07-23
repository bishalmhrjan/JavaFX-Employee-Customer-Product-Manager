package com.example.diyashop.model.finance.earnings;

import java.util.Date;

/**
 * earning has date and amount. Reciept must have
 */

public class Earning {

    private double earning;
    private Date date;


    public Earning(double earning) {
        this.earning = earning;
     }

    public double getEarning() {
        return earning;
    }

    public Date getDate() {
        return date;
    }
}
