package com.example.diyashop.controller.admin;

import com.example.diyashop.model.backend.FilialeShop;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "worker")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Worker {

    @Id
    @Column(name = "worker_id", updatable = false, nullable = false, columnDefinition = "CHAR(36)")
    private String workerId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;



    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "filiale_id", nullable = false)
    private FilialeShop filialeShop;



 }
