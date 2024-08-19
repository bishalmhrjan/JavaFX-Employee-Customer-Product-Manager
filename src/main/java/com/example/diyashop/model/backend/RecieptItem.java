package com.example.diyashop.model.backend;

import com.example.diyashop.model.productstype.ProductEnum;

import java.util.ArrayList;
import java.util.UUID;

public class RecieptItem {

    private Product product;
    private Reciept reciept;
    private UUID recieptForiegnKeyID;
    private UUID recieptItemID;
    private  UUID productFKID;

    private  int numberOfProducts;
    private double sellPrice;

    public RecieptItem(Product product, Reciept reciept,  int numberOfProducts, double sellPrice) {
        this.recieptForiegnKeyID = reciept.getRecieptID();
        this.productFKID = product.getProductId();;
        this.recieptItemID = UUID.randomUUID();
        this.numberOfProducts = numberOfProducts;
        this.sellPrice = sellPrice;
    }

    public Reciept getReciept() {
        return reciept;
    }

    public Product getProduct() {
        return product;
    }

    public UUID getRecieptForiegnKeyID() {
        return recieptForiegnKeyID;
    }

    public UUID getRecieptItemID() {
        return recieptItemID;
    }

    public UUID getProductFKID() {
        return productFKID;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
