package com.example.diyashop.model.finance.earnings;

import java.util.Date;

public class DailyEarning extends Earning{
    public DailyEarning(double earning) {
        super(earning);
    }

    private boolean isValid(Date date){

          return true;
    }
}
