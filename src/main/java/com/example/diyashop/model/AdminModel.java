package com.example.diyashop.model;

public class AdminModel extends EmployeeModel{

    private boolean hasChartRight = true;
    private boolean hasExpenditureRight = true;

    private boolean stateOfProductRight = true;

    public AdminModel(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public boolean isHasChartRight() {
        return hasChartRight;
    }

    public boolean isHasExpenditureRight() {
        return hasExpenditureRight;
    }

    public boolean isStateOfProductRight() {
        return stateOfProductRight;
    }
}
