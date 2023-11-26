package com.example.diyashop.model.backend;

import com.example.diyashop.model.productstype.ProductEnum;

import java.util.Date;

public class Reciept {
    private ProductEnum productName;
    private ProductEnum.ProductType productType;
    private int stock;
    private  double sellPrice;
     private double discount_percent;
    private Date date;

    private int recieptID;

    public Reciept(ProductEnum productName, ProductEnum.ProductType productType,
                   int stock, double sellPrice, double discount_percent, Date date, int recieptID) {
        this.productName = productName;
        this.productType = productType;
        this.stock = stock;
        this.sellPrice = sellPrice;
        this.discount_percent = discount_percent;
        this.date = date;
        this.recieptID = recieptID;
    }

    public int getRecieptID() {
        return recieptID;
    }

    public ProductEnum getProductName() {
        return productName;
    }

    public ProductEnum.ProductType getProductType() {
        return productType;
    }

    public int getStock() {
        return stock;
    }

    public double getSellPrice() {
        return sellPrice;
    }


    public double getDiscount_percent() {
        return discount_percent;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public void setDiscount_percent(double discount_percent) {
        this.discount_percent = discount_percent;
    }
}
