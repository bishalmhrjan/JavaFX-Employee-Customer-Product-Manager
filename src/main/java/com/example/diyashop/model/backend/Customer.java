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

    public Customer(){}
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setReciepts(ArrayList<Reciept> reciepts) {
        this.reciepts = reciepts;
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
