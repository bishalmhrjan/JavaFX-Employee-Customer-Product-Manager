package com.example.diyashop.controller.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee extends Worker {


    // Constructors, getters, and setters

    private Role employeeRight= Role.EMPLOYEE;
    // Default constructor for Hibernate



    // Other methods as needed
}
