package com.alex.spring.services;

import com.alex.spring.entities.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomer(int id);

    void removeCustomer(int id);

}
