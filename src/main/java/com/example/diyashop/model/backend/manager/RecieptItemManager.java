package com.example.diyashop.model.backend.manager;

import com.example.diyashop.model.backend.RecieptItem;

import java.util.UUID;

public class RecieptItemManager extends  GenericManager<RecieptItem, UUID> {
    public RecieptItemManager( ) {
        super(RecieptItem.class);
    }
}
