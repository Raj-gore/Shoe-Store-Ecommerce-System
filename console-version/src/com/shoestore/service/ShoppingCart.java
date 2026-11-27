package com.shoestore.service;

import java.util.ArrayList;
import java.util.Iterator;

import com.shoestore.model.CartItem;
import com.shoestore.model.Product;


public class ShoppingCart {
    private ArrayList<CartItem> cartItems = new ArrayList<>();
    
	public ArrayList<CartItem> getCartItems() {
	    return new ArrayList<>(cartItems);
	}
	
    public void addToCart(Product product, int quantity) {
    	    if (product == null || quantity <= 0) {
    	        System.out.println("Invalid product or quantity!");
    	        return;
    	        
    	    }    
    	    for (CartItem item : cartItems) {

    	        if (item.getProduct().getProductId() == product.getProductId()) {

    	            item.setQuantity(item.getQuantity() + quantity);
    	            System.out.println("Cart quantity updated!");
    	            return;
    	        }
    	    }	    
    	    CartItem newItem = new CartItem(product, quantity);
    	    cartItems.add(newItem);
    	    System.out.println("Product added to cart successfully!");
    }
    public void removeFromCart(int productId) {
        Iterator<CartItem> iterator = cartItems.iterator();
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.getProduct().getProductId() == productId) {
                iterator.remove();
                System.out.println("Product removed from cart!");
                return;
            }
        }
        System.out.println("Product not found in cart!");
    }
    
    public double getCartTotal() {
        double total = 0;
        for (CartItem item : cartItems) {
            total = total + item.getSubtotal();
        }

        return total;
    }
    
    public void increaseQuantity(int productId) {
        for (CartItem item : cartItems) {
            if (item.getProduct().getProductId() == productId) {
                item.setQuantity(item.getQuantity() + 1);
                System.out.println("Quantity increased!");
                return;
            }
        }
        System.out.println("Product not found in cart!");
    }
    public void decreaseQuantity(int productId) {
        for (CartItem item : cartItems) {
            if (item.getProduct().getProductId() == productId) {
                if (item.getQuantity() > 1) {
                    item.setQuantity(item.getQuantity() - 1);
                    System.out.println("Quantity decreased!");
                } else {
                    System.out.println("Quantity cannot be less than 1. Remove the product instead.");
                }
                return;
            }
        }
        System.out.println("Product not found in cart!");
    }
    public boolean isEmpty() {
        return cartItems.isEmpty();
    }
}



