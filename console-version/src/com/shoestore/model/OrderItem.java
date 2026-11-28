package com.shoestore.model;

public class OrderItem {
    private Product product;
    private int quantity;
    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public Product getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getSubtotal() {
        if (product == null) {
            return 0.0;
        }
        return product.getPrice() * quantity;
    }
}