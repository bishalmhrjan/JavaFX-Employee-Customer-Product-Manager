package com.example.diyashop.model.backend;

import java.util.UUID;

public class FilialeShop {
    private UUID filialeID;
    private String cityName;

    public FilialeShop(String cityName) {
        this.cityName = cityName;
        this.filialeID =UUID.randomUUID();
    }

    public UUID getFilialeID() {
        return filialeID;
    }

    public String getCityName() {
        return cityName;
    }
}
