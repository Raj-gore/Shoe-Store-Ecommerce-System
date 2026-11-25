package com.shoestore.service;

import java.util.ArrayList;
import com.shoestore.model.Product;

public class ProductService {

    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getAllProducts() {
        return new ArrayList<>(products);
    }
}