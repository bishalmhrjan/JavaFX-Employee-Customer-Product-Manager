package com.example.diyashop.model.backend.manager;

import com.example.diyashop.model.backend.ProductInTracker;

import java.util.UUID;

public class ProductInTrackerManager extends GenericManager<ProductInTracker, UUID> {
    public ProductInTrackerManager( ) {
        super(ProductInTracker.class);
    }
}
