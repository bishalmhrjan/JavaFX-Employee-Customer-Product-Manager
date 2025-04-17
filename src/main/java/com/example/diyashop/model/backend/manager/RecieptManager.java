package com.example.diyashop.model.backend.manager;

import com.example.diyashop.model.Reciept;

import java.util.UUID;

public class RecieptManager extends GenericManager<Reciept, UUID> {
    public RecieptManager( ) {
        super(Reciept.class);
    }
}
