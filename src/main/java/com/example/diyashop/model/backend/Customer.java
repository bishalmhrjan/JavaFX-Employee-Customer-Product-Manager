package com.example.diyashop.model.backend;

import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private ArrayList<Reciept> reciepts;
    private Date dateOfBirth;
    private String sex;
    private Country residence;
    private Country nationality;

    private Occupation occupation;



    public Customer(String firstName, String lastName, String userName,   Date dateOfBirth, String sex, Country residence, Country nationality, Occupation occupation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.reciepts = new ArrayList<>();
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.residence = residence;
        this.nationality = nationality;
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

    public String getUserName() {
        return userName;
    }

    public ArrayList<Reciept> getReciepts() {
        return reciepts;
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
