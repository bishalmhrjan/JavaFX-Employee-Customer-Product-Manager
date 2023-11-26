package com.example.diyashop.model.backend;

import com.example.diyashop.model.productstype.ProductEnum;

public class RecieptItem {
    private ProductEnum productName;
    private ProductEnum.ProductType productType;
    private int recieptNr;
    private int recieptItemID;

    private int numberOfProduct;

    public RecieptItem(ProductEnum productName, ProductEnum.ProductType productType, int recieptNr, int recieptItemID, int numberOfProduct) {
        this.productName = productName;
        this.productType = productType;
        this.recieptNr = recieptNr;
        this.recieptItemID = recieptItemID;
        this.numberOfProduct = numberOfProduct;
    }

    public ProductEnum getProductName() {
        return productName;
    }

    public ProductEnum.ProductType getProductType() {
        return productType;
    }

    public int getRecieptNr() {
        return recieptNr;
    }

    public int getRecieptItemID() {
        return recieptItemID;
    }

    public int getNumberOfProduct() {
        return numberOfProduct;
    }
}
