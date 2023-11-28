package com.example.diyashop.controller.admin;

import com.example.diyashop.model.productstype.ProductEnum;

public class InvoiceItem {
    private ProductEnum productEnum;
    private ProductEnum.ProductType productType;
    private double price;
    private int numberOfStocks;
    private double total;

    public InvoiceItem(ProductEnum productEnum, ProductEnum.ProductType productType, double price, int numberOfStocks, double total) {
        this.productEnum = productEnum;
        this.productType = productType;
        this.price = price;
        this.numberOfStocks = numberOfStocks;
        this.total = total;
    }

    public ProductEnum getProductEnum() {
        return productEnum;
    }

    public ProductEnum.ProductType getProductType() {
        return productType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfStocks() {
        return numberOfStocks;
    }

    public double getTotal() {
        return total;
    }
}
