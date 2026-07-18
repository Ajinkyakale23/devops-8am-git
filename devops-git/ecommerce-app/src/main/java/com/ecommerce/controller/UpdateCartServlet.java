package com.ecommerce.controller;

import com.ecommerce.model.Cart;
import com.ecommerce.service.CartService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/update-cart")
public class UpdateCartServlet extends HttpServlet {

    private final CartService cartService = new CartService();

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        int index = Integer.parseInt(request.getParameter("index"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        if (index >= 0 && index < cartService.getCartItems().size()) {

            Cart cart = cartService.getCartItems().get(index);
            cart.setQuantity(quantity);
        }

        response.sendRedirect("cart");
    }
}