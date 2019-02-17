package com.alex.spring.dao;

import com.alex.spring.entities.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomer(int id);

    void removeCustomer(int id);

}
