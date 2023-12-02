package com.example.diyashop.model.backend;

public class ProductInTracker {
    private int id;
    private int product_id_fk;
    private int unit;
    private int inStore;
    private int total;

    private String date;

    private double targetPrice;


    public ProductInTracker(int id, int product_id_fk, int unit, int inStore, int total, String date, double targetPrice) {
        this.id = id;
        this.product_id_fk = product_id_fk;
        this.unit = unit;
        this.inStore = inStore;
        this.total = total;
        this.date = date;
        this.targetPrice = targetPrice;
    }

    public int getId() {
        return id;
    }

    public int getProduct_id_fk() {
        return product_id_fk;
    }

    public int getUnit() {
        return unit;
    }

    public int getInStore() {
        return inStore;
    }

    public int getTotal() {
        return total;
    }

    public String getDate() {
        return date;
    }

    public double getTargetPrice() {
        return targetPrice;
    }
}
