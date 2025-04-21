package com.example.diyashop.model.backend;

import com.example.diyashop.model.entity.Product;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "recieptItem")
public class RecieptItem {

    @Id
    @Column(name = "reciept_item_id", updatable = false, nullable = false, columnDefinition = "CHAR(36)")
    private String recieptItemID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reciept_id", nullable = false)
    private Reciept reciept;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "number_of_products", nullable = false)
    private int numberOfProducts;

    @Column(name = "sell_price", nullable = false)
    private double sellPrice;

    // Constructor
    public RecieptItem(Reciept reciept, Product product, int numberOfProducts, double sellPrice) {
        this.recieptItemID = UUID.randomUUID().toString();
        this.reciept = reciept;
        this.product = product;
        this.numberOfProducts = numberOfProducts;
        this.sellPrice = sellPrice;
    }

    public RecieptItem() {
        this.recieptItemID=UUID.randomUUID().toString();
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setReciept(Reciept reciept) {
        this.reciept = reciept;
    }

    public Reciept getReciept() {
        return reciept;
    }

    public Product getProduct() {
        return product;
    }

    public String getRecieptItemID() {
        return recieptItemID;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public double getSellPrice() {
        return sellPrice;
    }


    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
