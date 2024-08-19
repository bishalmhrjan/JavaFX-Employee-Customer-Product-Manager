package com.example.diyashop.model.backend;

import java.util.Date;
import java.util.UUID;

public class ProductInTracker {
    private UUID id;
    private UUID ProducktFKId;
    private int unit;
    private int inStore;
    private int total;
    private Date entryDate;
    private String date;

    private double targetPrice;
    private Product product;

    public ProductInTracker(Product product, int unit, int inStore, int total, Date entryDate, String date, double targetPrice) {
        this.ProducktFKId = product.getProductId();
        this.unit = unit;
        this.inStore = inStore;
        this.total = total;
        this.entryDate = entryDate;
        this.date = date;
        this.targetPrice = targetPrice;
        this.id =UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public UUID getProducktFKId() {
        return ProducktFKId;
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

    public Date getEntryDate() {
        return entryDate;
    }

    public String getDate() {
        return date;
    }

    public double getTargetPrice() {
        return targetPrice;
    }
}
