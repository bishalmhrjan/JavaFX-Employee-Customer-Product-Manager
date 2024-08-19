package com.example.diyashop.model.backend;

import com.example.diyashop.model.productstype.ProductEnum;

import java.util.Date;
import java.util.UUID;

public class Product {

    private ProductEnum productName;
    private ProductEnum.ProductType productType;
    private UUID productId;

    public Product(ProductEnum productName, ProductEnum.ProductType productType) {
        this.productName = productName;
        this.productType = productType;
        this.productId = UUID.randomUUID();
    }

    public ProductEnum getProductName() {
        return productName;
    }

    public ProductEnum.ProductType getProductType() {
        return productType;
    }

    public UUID getProductId() {
        return productId;
    }
}
