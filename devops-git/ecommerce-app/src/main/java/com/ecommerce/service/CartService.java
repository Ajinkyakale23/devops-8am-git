package com.ecommerce.service;

import com.ecommerce.model.Cart;

import java.util.ArrayList;
import java.util.List;

public class CartService {

    private static final List<Cart> cartItems = new ArrayList<>();

    public void addToCart(Cart cart) {
        cartItems.add(cart);
    }

    public List<Cart> getCartItems() {
        return cartItems;
    }

    public double getGrandTotal() {

        double total = 0;

        for (Cart cart : cartItems) {
            total += cart.getTotalPrice();
        }

        return total;
    }

    public void clearCart() {
        cartItems.clear();
    }
}