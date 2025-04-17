package com.example.diyashop.controller.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "admin")
@Inheritance(strategy = InheritanceType.JOINED)
public class Admin extends Worker {

private Role admin = Role.ADMIN;

}