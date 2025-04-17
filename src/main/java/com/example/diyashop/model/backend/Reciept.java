package com.example.diyashop.model.backend;

import com.example.diyashop.model.productstype.ProductEnum;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "reciept")
public class Reciept {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "filiale_id", nullable = false)
    private FilialeShop filialeShop;

    @Column(nullable = false)
    private double totalAmount;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;

    @Id
    @Column(name = "reciept_id", updatable = false, nullable = false, columnDefinition = "CHAR(36)")
    private String recieptID;

    @OneToMany(mappedBy = "reciept", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RecieptItem> recieptItems = new ArrayList<>();
    public Reciept(Customer customer, FilialeShop filialeShop, double totalAmount, Date date) {
        this.customer = customer;
        this.filialeShop = filialeShop;
        this.totalAmount = totalAmount;
        this.date = date;
        this.recieptID = UUID.randomUUID().toString();
    }

    public Reciept() {
        this.recieptID=UUID.randomUUID().toString();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void addRecieptItem(RecieptItem recieptItem){
        recieptItems.add(recieptItem);
        recieptItem.setReciept(this);

    }public void removeRecieptItem(RecieptItem recieptItem){
        recieptItems.remove(recieptItem);
        recieptItem.setReciept(null);

    }
    public void setFilialeShop(FilialeShop filialeShop) {
        this.filialeShop = filialeShop;
    }

    public Customer getCustomer() {
        return customer;
    }

    public FilialeShop getFilialeShop() {
        return filialeShop;
    }


    public double getTotalAmount() {
        return totalAmount;
    }

    public Date getDate() {
        return date;
    }

    public String getRecieptID() {
        return recieptID;
    }

 }