package com.ecommerce.controller;

import com.ecommerce.service.CartService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/remove-cart")
public class RemoveFromCartServlet extends HttpServlet {

    private final CartService cartService = new CartService();

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        int index = Integer.parseInt(request.getParameter("index"));

        if (index >= 0 && index < cartService.getCartItems().size()) {
            cartService.getCartItems().remove(index);
        }

        response.sendRedirect("cart");
    }
}