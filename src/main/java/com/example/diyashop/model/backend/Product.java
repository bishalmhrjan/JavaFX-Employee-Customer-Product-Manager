package com.example.diyashop.model.backend;

import com.example.diyashop.model.productstype.ProductEnum;

import java.util.Date;

public class Product {

    private ProductEnum productName;
    private ProductEnum.ProductType productType;
    private int numberOfStock;
    private double boughtPrice;
    private double targetPrice;
    private double discountPercentage;

    private Date dateOfEntry;


    public Product(ProductEnum productName, ProductEnum.ProductType productType, int numberOfStock, double boughtPrice, double targetPrice, double discountPercentage, Date dateOfEntry) {
        this.productName = productName;
        this.productType = productType;
        this.numberOfStock = numberOfStock;
        this.boughtPrice = boughtPrice;
        this.targetPrice = targetPrice;
        this.discountPercentage = discountPercentage;
        this.dateOfEntry = dateOfEntry;
    }

    public Date getDateOfEntry() {
        return dateOfEntry;
    }

    public ProductEnum getProductName() {
        return productName;
    }

    public ProductEnum.ProductType getProductType() {
        return productType;
    }

    public int getNumberOfStock() {
        return numberOfStock;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getTargetPrice() {
        return targetPrice;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setNumberOfStock(int numberOfStock) {
        this.numberOfStock = numberOfStock;
    }

    public void setTargetPrice(double targetPrice) {
        this.targetPrice = targetPrice;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
