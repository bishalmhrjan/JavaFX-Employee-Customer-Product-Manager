package com.example.diyashop.model.entity;




import com.example.diyashop.model.backend.Country;
import com.example.diyashop.model.backend.CustomerFilialeTable;
import com.example.diyashop.model.backend.Reciept;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
@Entity

@Table(name = "customer")
public class Customer {
    @Column(name = "first_name", updatable = false, nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;



    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reciept> receipts = new ArrayList<>();

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "sex")
    private String sex;

    @OneToMany(mappedBy = "filialeShop", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CustomerFilialeTable> customerFilialeTables = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    @Column(name = "residence", nullable = false)
    private Country residence;

    @Enumerated(EnumType.STRING)
    @Column(name = "nationality", nullable = false)
    private Country nationality;


    @Id
    @Column(name = "customer_id", updatable = false, nullable = false)
    private String customerId;


     public Customer(String firstName, String lastName, String userName,   Date dateOfBirth, String sex, Country residence, Country nationality ) {
        this.firstName = firstName;
        this.lastName = lastName;
         this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.residence = residence;
        this.nationality = nationality;
         this.customerId = UUID.randomUUID().toString();
    }

    public Customer(){
        this.customerId = UUID.randomUUID().toString();

    }
    public void addCustomerFiliale(CustomerFilialeTable customerFilialeTable){
         customerFilialeTables.add(customerFilialeTable);
         customerFilialeTable.setCustomer(this);
    }
    public void removeCustomerFiliale(CustomerFilialeTable customerFilialeTable){
         customerFilialeTables.remove(customerFilialeTable);
         customerFilialeTable.setCustomer(null);
    }
    public  void addReciept(Reciept reciept){
         receipts.add(reciept);
         reciept.setCustomer(this);
    }

    public void removeReciept(Reciept reciept){
         receipts.remove(reciept);
         reciept.setCustomer(null);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Reciept> getReceipts() {
        return receipts;
    }

    public void setReceipts(List<Reciept> receipts) {
        this.receipts = receipts;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<CustomerFilialeTable> getCustomerFilialeTables() {
        return customerFilialeTables;
    }

    public void setCustomerFilialeTables(List<CustomerFilialeTable> customerFilialeTables) {
        this.customerFilialeTables = customerFilialeTables;
    }

    public Country getResidence() {
        return residence;
    }

    public void setResidence(Country residence) {
        this.residence = residence;
    }

    public Country getNationality() {
        return nationality;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
