package com.ecommerce.service;

import com.ecommerce.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private static final List<Order> orders = new ArrayList<>();

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getAllOrders() {
        return orders;
    }

    public Order getOrderById(int orderId) {

        for (Order order : orders) {

            if (order.getOrderId() == orderId) {
                return order;
            }
        }

        return null;
    }
}