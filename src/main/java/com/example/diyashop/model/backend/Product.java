package com.example.diyashop.model.backend;

import com.example.diyashop.model.productstype.ProductEnum;

import java.util.Date;

public class Product {

    private ProductEnum productName;
    private ProductEnum.ProductType productType;
    private int product_id;

    public Product(ProductEnum productName, ProductEnum.ProductType productType, int product_id) {
        this.productName = productName;
        this.productType = productType;
        this.product_id = product_id;
    }

    public ProductEnum getProductName() {
        return productName;
    }

    public ProductEnum.ProductType getProductType() {
        return productType;
    }

    public int getProduct_id() {
        return product_id;
    }
}
