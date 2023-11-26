package com.example.diyashop.model.backend;

import java.util.Date;

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int recieptNumber;
    private Date dateOfBirth;
    private String sex;
    private Country residence;
    private Country nationality;

    private Occupation occupation;

    public Customer(String firstName, String lastName, String userName,  Date dateOfBirth, String sex, Country residence, Country nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.residence = residence;
        this.nationality = nationality;
    }

    public Customer(String firstName, String lastName, String userName, int recieptNumber, Date dateOfBirth, String sex, Country residence, Country nationality, Occupation occupation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.recieptNumber = recieptNumber;
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

    public int getRecieptNumber() {
        return recieptNumber;
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
