package com.example.diyashop.model.entity;



import com.example.diyashop.controller.admin.Role;
import jakarta.persistence.*;

@Entity
@Table(name = "employee")
@PrimaryKeyJoinColumn(name = "worker_id")
public class Employee extends Worker {


    // Constructors, getters, and setters

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private Role employeeRight= Role.EMPLOYEE;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    // Default constructor for Hibernate



    // Other methods as needed
}
