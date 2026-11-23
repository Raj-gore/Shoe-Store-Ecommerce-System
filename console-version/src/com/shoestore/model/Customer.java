package com.shoestore.model;

public class Customer extends User {

    public Customer() {
        super();
    }

    public Customer(int userId, String name, String email, String phoneNo) {
        super(userId, name, email, phoneNo);
    }
}