package com.shoestore.main;

import java.util.ArrayList;
import com.shoestore.model.Product;

import com.shoestore.model.Admin;
import com.shoestore.model.Customer;
import com.shoestore.model.User;
import com.shoestore.service.CustomerService;

public class Main {

    public static void main(String[] args) {
    	
    // DAY 1 - PROJECT SETUP
    	// Packages and project structure setup (no console output)
    	
    // DAY 2 - USER, CUSTOMER & ADMIN
    	System.out.println("\n========== DAY 2: USER, CUSTOMER & ADMIN ==========");
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

        System.out.println("Admin User ID: " + admin.getUserId());
        System.out.println("Admin Name: " + admin.getName());
        System.out.println("Admin Email: " + admin.getEmail());
        System.out.println("Admin Phone: " + admin.getPhoneNo());

    // DAY 3 - CUSTOMER REGISTRATION
        System.out.println("\n========== DAY 3: CUSTOMER REGISTRATION ==========");

        // Create CustomerService object only once
        CustomerService customerService = new CustomerService();

        Customer c1 = new Customer(101, "Mangesh", "mangesh@gmail.com", "9876543210");
        Customer c2 = new Customer(102, "Dipak", "dipak@gmail.com", "9876543211");
        Customer c3 = new Customer(103, "Rahul", "mangesh@gmail.com", "9876543212");
        Customer c4 = new Customer(104, "Rohit", " ", "9876543213");

        System.out.println("Mangesh Registration: " + customerService.registerCustomer(c1));
        System.out.println("Dipak Registration: " + customerService.registerCustomer(c2));
        System.out.println("Duplicate Email Registration: " + customerService.registerCustomer(c3));
        System.out.println("Blank Email Registration: " + customerService.registerCustomer(c4));

    // DAY 4 - DISPLAY CUSTOMERS
        System.out.println("\n========== DAY 4: DISPLAY CUSTOMERS ==========");

        // Retrieve all registered customers
        ArrayList<Customer> customerList = customerService.getAllCustomers();

        for (Customer customerDetails : customerList) {

            System.out.println("ID: " + customerDetails.getUserId());
            System.out.println("Name: " + customerDetails.getName());
            System.out.println("Email: " + customerDetails.getEmail());
            System.out.println("Phone: " + customerDetails.getPhoneNo());
            System.out.println("----------------------");
        }

    // DAY 5 - PRODUCT CATALOG
        System.out.println("\n========== DAY 5: PRODUCT CATALOG ==========");

        Product p1 = new Product(101, "Air Max", "Nike", 5999.0, "Running");
        Product p2 = new Product(102, "Ultraboost", "Adidas", 7999.0, "Casual");

        ArrayList<Product> products = new ArrayList<>();

        products.add(p1);
        products.add(p2);

        System.out.println("Total products: " + products.size());

        for (Product product : products) {

            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Name: " + product.getName());
            System.out.println("Brand: " + product.getBrand());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Category: " + product.getCategory());
            System.out.println("----------------------");
        }
    }
}