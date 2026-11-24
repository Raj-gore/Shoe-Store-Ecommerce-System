package com.shoestore.main;

import com.shoestore.model.Admin;
import com.shoestore.model.Customer;
import com.shoestore.model.User;

import com.shoestore.service.CustomerService;


public class Main {

	
	public static void main(String[] args) {
		User user = new User(101, "Mangesh", "mangesh@gmail.com", "9876543210");

        System.out.println("User ID: " + user.getUserId());
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Phone: " + user.getPhoneNo());
        
        Customer customer = new Customer(102, "Dipak", "dipak@gmail.com", "9876543211");

        System.out.println("Customer User ID: " + customer.getUserId());
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Email: " + customer.getEmail());
        System.out.println("Customer Phone: " + customer.getPhoneNo());
        
        Admin admin = new Admin(103, "Rushikesh", "rushikesh@gmail.com", "7852369546");
        
        System.out.println("Admin User ID:" + admin.getUserId());
        System.out.println("Admin Name:" + admin.getName());
        System.out.println("Admin Email:"+ admin.getEmail());
        System.out.println("Admin Phone:"+ admin.getPhoneNo());
        
        CustomerService customerService = new CustomerService();

        Customer c1 = new Customer(101, "Mangesh", "mangesh@gmail.com", "9876543210");
        Customer c2 = new Customer(102, "Dipak", "dipak@gmail.com", "9876543211");
        Customer c3 = new Customer(103, "Rahul", "mangesh@gmail.com", "9876543212");
        Customer c4 = new Customer(104, "Rohit", " ", "9876543213");

        System.out.println("Mangesh Registration: " + customerService.registerCustomer(c1));

        System.out.println("Dipak Registration: " + customerService.registerCustomer(c2));

        System.out.println("Duplicate Email Registration: " + customerService.registerCustomer(c3));

        System.out.println("Blank Email Registration: " + customerService.registerCustomer(c4));
	}
}
