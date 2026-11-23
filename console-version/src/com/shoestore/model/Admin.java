package com.shoestore.model;

public class Admin extends User {

    public Admin() {
        super();
    }

    public Admin(int userId, String name, String email, String phoneNo) {
        super(userId, name, email, phoneNo);
    }
}