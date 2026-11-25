package com.shoestore.service;

import java.util.ArrayList;

import com.shoestore.model.Customer;

public class CustomerService {

    private ArrayList<Customer> customers = new ArrayList<>();

    public boolean isEmailExists(String email) {

        if (email == null) {
            return false;
        }

        for (Customer customer : customers) {

            if (customer != null && email.equalsIgnoreCase(customer.getEmail())) {
                return true;
            }
        }

        return false;
    }

    public boolean registerCustomer(Customer customer) {

        if (customer == null) {
            return false;
        }
        
        if (customer.getEmail() == null || customer.getEmail().isBlank()) {
            return false;
        }

        if (isEmailExists(customer.getEmail())) {
            return false;
        }

        customers.add(customer);

        return true;
    }

    public ArrayList<Customer> getAllCustomers() {
        return new ArrayList<>(customers);
    }
}