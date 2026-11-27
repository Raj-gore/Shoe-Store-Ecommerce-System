package com.shoestore.service;

import java.util.ArrayList;

import com.shoestore.model.Product;

public class ProductService {

    private ArrayList<Product> products = new ArrayList<>();
        
    public boolean isProductIdExists(int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return true;
            }
        }
        return false;
    } 
    
    public void addProduct(Product product) {

        if (!isValidProduct(product)) {
            System.out.println("Invalid product details!");
            return;
        }

        if (isProductIdExists(product.getProductId())) {
            System.out.println("Product ID already exists!");
            return;
        }

        products.add(product);
        System.out.println("Product added successfully!");
    }
    
    public ArrayList<Product> getAllProducts() {
        return new ArrayList<>(products);
    }
    
    public boolean isValidProduct(Product product) {
    	

        if (product == null) {
            return false;
        }
        if (product.getProductId() <= 0) {
            return false;
        }
        if (product.getName() == null || product.getName().isBlank()) {
            return false;
        }
        if (product.getBrand() == null || product.getBrand().isBlank()) {
            return false;
        }
        if (product.getPrice() <= 0) {
            return false;
        }
        if (product.getCategory() == null || product.getCategory().isBlank()) {
            return false;
        }
        return true;
    }
    
    public Product getProductById(int productId) {

        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }

        return null;
    }
    public ArrayList<Product> searchProductsByName(String name) {

        ArrayList<Product> searchResults = new ArrayList<>();

        if (name == null || name.isBlank()) {
            return searchResults;
        }

        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                searchResults.add(product);
            }
        }

        return searchResults;
    }
    
    
}