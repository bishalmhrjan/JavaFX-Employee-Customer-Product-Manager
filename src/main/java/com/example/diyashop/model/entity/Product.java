package com.example.diyashop.model.entity;

import com.example.diyashop.model.backend.RecieptItem;
import com.example.diyashop.model.productstype.ProductEnum;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "product")
public class Product {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProductEnum productName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProductEnum.ProductType productType;

    @Id
    @Column(updatable = false, nullable = false, columnDefinition = "CHAR(36)")
    private String productId;

    private double price;
    private int stock;

    public Product(ProductEnum productName, ProductEnum.ProductType productType, String productId, double price, List<RecieptItem> recieptItems) {
        this.productName = productName;
        this.productType = productType;
        this.productId = productId;
        this.price = price;
        this.recieptItems = recieptItems;
    }

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RecieptItem> recieptItems = new ArrayList<>();
    public Product(ProductEnum productName, ProductEnum.ProductType productType, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.productType = productType;
        this.stock = stock;
        this.productId = UUID.randomUUID().toString();

    }
    public Product(ProductEnum productName, ProductEnum.ProductType productType ) {
        this.productName = productName;
        this.price = 15;
        this.stock =15;
        this.productType = productType;
        this.productId = UUID.randomUUID().toString();

    }
    public Product() {
        this.productId = UUID.randomUUID().toString();

    }

    public void addRecieptItem(RecieptItem recieptItem){
        recieptItems.add(recieptItem);
        recieptItem.setProduct(this);

    }public void removeRecieptItem(RecieptItem recieptItem){
        recieptItems.remove(recieptItem);
        recieptItem.setReciept(null);

    }
    // Getters
    public ProductEnum getProductName() {
        return productName;
    }

    public ProductEnum.ProductType getProductType() {
        return productType;
    }

    public String getProductId() {
        return productId;
    }
}