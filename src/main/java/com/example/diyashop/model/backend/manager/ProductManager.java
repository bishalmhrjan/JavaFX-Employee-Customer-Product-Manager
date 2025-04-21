package com.example.diyashop.model.backend.manager;

import com.example.diyashop.model.entity.Product;
import com.example.diyashop.model.productstype.ProductEnum;

import java.util.UUID;

public class ProductManager extends GenericManager<Product, UUID> {
    public ProductManager( ) {
        super(Product.class);
    }

    public static void main(String[] args) {


             ProductEnum productName= ProductEnum.BAG;
        ProductEnum.ProductType productType = ProductEnum.ProductType.COLOR_BLUE;
        Product product = new Product(productName,productType);

        ProductManager productManager = new ProductManager();
        productManager.save(product);

        }


}
