package com.example.diyashop.model.backend;


import javax.persistence.*;

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

    @Enumerated(EnumType.STRING)
    @Column(name = "occupation", nullable = false)
    private Occupation occupation;

    @Id
    @Column(name = "customer_id", updatable = false, nullable = false)
    private String customerId;


     public Customer(String firstName, String lastName, String userName,   Date dateOfBirth, String sex, Country residence, Country nationality, Occupation occupation) {
        this.firstName = firstName;
        this.lastName = lastName;
         this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.residence = residence;
        this.nationality = nationality;
        this.occupation = occupation;
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

    public String getCustomerId() {
        return customerId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setResidence(Country residence) {
        this.residence = residence;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }


    public Occupation getOccupation() {
        return occupation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public Country getResidence() {
        return residence;
    }

    public Country getNationality() {
        return nationality;
    }


}
