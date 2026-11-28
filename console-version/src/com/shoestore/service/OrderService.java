package com.shoestore.service;

import java.util.ArrayList;

import com.shoestore.model.CartItem;
import com.shoestore.model.Order;
import com.shoestore.model.OrderItem;
public class OrderService {
	private ArrayList<Order> orders = new ArrayList<>();
	public boolean isOrderIdExists(int orderId) {
        for (Order order : orders) {
            if (order != null && order.getOrderId() == orderId) {
                return true;
            }
        }
        return false;
    }
	
	public boolean addOrder(Order order) {

	    if (order == null) {
	        System.out.println("Invalid order!");
	        return false;
	    }

	    if (isOrderIdExists(order.getOrderId())) {
	        System.out.println("Order ID already exists!");
	        return false;
	    }

	    orders.add(order);
	    System.out.println("Order placed successfully!");
	    return true;
	}
	
	public ArrayList<Order> getAllOrders() {
	    return new ArrayList<>(orders);
	}
	
	public Order getOrderById(int orderId) {

	    for (Order order : orders) {

	        if (order.getOrderId() == orderId) {
	            return order;
	        }
	    }

	    return null;
	}
	
	public void placeOrder(int orderId, int customerId, ShoppingCart cart) {
	    if (cart == null || cart.isEmpty()) {
	        System.out.println("Cart is empty! Cannot place order.");
	        return;
	    }
	    if (orderId <= 0 || customerId <= 0) {
	        System.out.println("Invalid order or customer ID!");
	        return;
	    }

	    ArrayList<OrderItem> orderItems = new ArrayList<>();

	    for (CartItem cartItem : cart.getCartItems()) {

	        OrderItem orderItem = new OrderItem(
	                cartItem.getProduct(),
	                cartItem.getQuantity()
	        );

	        orderItems.add(orderItem);
	    }

	    Order order = new Order(orderId, customerId, orderItems);

	    if (addOrder(order)) {
	        System.out.println("Order ID: " + order.getOrderId());
	        System.out.println("Order Total: " + order.getOrderTotal());
	        cart.clearCart();
	    }
	}
}
