package com.example.diyashop.model.backend.manager;

import com.example.diyashop.model.backend.Country;
import com.example.diyashop.model.entity.Customer;

import java.util.Date;
import java.util.UUID;

public class CustomerManager extends GenericManager<Customer, UUID>{
    public CustomerManager( ) {
        super(Customer.class);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setFirstName("Bishal");
        customer.setLastName("Maharjan");
         customer.setDateOfBirth(new Date());
        customer.setSex("male");
        customer.setResidence(Country.AFGHANISTAN);
        customer.setNationality(Country.GERMANY);

        System.out.println("customer id is "+customer.getCustomerId());
        System.out.println("customer name is "+customer.getFirstName());
        System.out.println("customer lastName is "+customer.getLastName());
        System.out.println("customer sex is "+customer.getSex());

        CustomerManager customerManager = new CustomerManager();
        customerManager.save(customer);
    }
}
