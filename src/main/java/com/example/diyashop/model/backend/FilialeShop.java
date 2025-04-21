package com.example.diyashop.model.backend;

import com.example.diyashop.model.entity.Worker;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "filiale_shop")
public class FilialeShop {
    @Id
    @Column(name = "filiale_id", updatable = false, nullable = false, columnDefinition = "CHAR(36)")
    private String filialeID;

    @OneToMany(mappedBy = "filialeShop", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reciept> reciepts = new ArrayList<>();

    @OneToMany(mappedBy = "filialeShop", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Worker> workers = new ArrayList<>();

    @OneToMany(mappedBy = "filialeShop", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CustomerFilialeTable> customerFilialeTables = new ArrayList<>();

    @Column(name = "city_name", nullable = false)
    private String cityName;
    public void addCustomerFiliale(CustomerFilialeTable customerFilialeTable){
        customerFilialeTables.add(customerFilialeTable);
        customerFilialeTable.setFilialeShop(this);
    }
    public void removeCustomerFiliale(CustomerFilialeTable customerFilialeTable){
        customerFilialeTables.remove(customerFilialeTable);
        customerFilialeTable.setFilialeShop(null);
    }

    public FilialeShop() {
        this.filialeID= UUID.randomUUID().toString();
    }

    public FilialeShop(String cityName) {
        this.cityName = cityName;
        this.filialeID =UUID.randomUUID().toString();
    }

    public void addWorker(Worker worker){
        workers.add(worker);
        worker.setFilialeShop(this);
    }

    public void removeWorker(Worker worker){
        workers.remove(worker);
        worker.setFilialeShop(null);
    }
    public void addReciept(Reciept reciept){
        reciepts.add(reciept);
        reciept.setFilialeShop(this);
    }

    public void removeReciept(Reciept reciept){
        reciepts.remove(reciept);
        reciept.setFilialeShop(null);
    }

    public String getFilialeID() {
        return filialeID;
    }

    public String getCityName() {
        return cityName;
    }
}
