package com.shoestore.model;

import java.util.ArrayList;

public class Order {
    private int orderId;
    private int customerId;
    private ArrayList<OrderItem> orderItems;
    public Order(int orderId, int customerId, ArrayList<OrderItem> orderItems) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderItems = orderItems;
    }
    public int getOrderId() {
        return orderId;
    }
    public int getCustomerId() {
        return customerId;
    }
    public ArrayList<OrderItem> getOrderItems() {
        return new ArrayList<>(orderItems);
    }
    public double getOrderTotal() {
        double total = 0;
        for (OrderItem item : orderItems) {
            total = total + item.getSubtotal();
        }

        return total;
    }
}