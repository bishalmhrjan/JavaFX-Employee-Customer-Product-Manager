package com.example.diyashop.model.backend;

import com.example.diyashop.model.entity.Product;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "product_in_tracker")
public class ProductInTracker {

    @Id
    @Column(updatable = false, nullable = false, columnDefinition = "CHAR(36)")
    private String id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(nullable = false)
    private int unit;

    @Column(nullable = false)
    private int inStore;

    @Column(nullable = false)
    private int total;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date entryDate;

    @Column(nullable = false)
    private double targetPrice;

    // Constructor, getters, and setters...

    // Constructor
    public ProductInTracker(Product product, int unit, int inStore, int total, Date entryDate,  double targetPrice) {
        this.product = product;
        this.unit = unit;
        this.inStore = inStore;
        this.total = total;
        this.entryDate = entryDate;
         this.targetPrice = targetPrice;
        this.id = UUID.randomUUID().toString();
    }

    public ProductInTracker() {
        this.id= UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
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


    public double getTargetPrice() {
        return targetPrice;
    }
}
