package com.example.diyashop.model.finance.earnings;

import java.time.LocalDate;



public class WeeklyEarning extends Earning{

    private LocalDate fromDate;
    private LocalDate toDate;

    public WeeklyEarning(double earning, LocalDate fromDate,LocalDate toDate) {
        super(earning);
        if(fromDate.compareTo(toDate)<0 && (LocalDate.from(toDate).minusDays(7)==fromDate)){
         this.fromDate = fromDate;
         this.toDate= toDate;
        }
    }



}
