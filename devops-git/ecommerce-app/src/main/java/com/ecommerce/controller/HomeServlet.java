package com.ecommerce.controller;

import com.ecommerce.service.ProductService;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class HomeServlet extends HttpServlet {

    private ProductService productService;

    @Override
    public void init() throws ServletException {
        productService = new ProductService();
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("products", productService.getAllProducts());

        RequestDispatcher rd =
                request.getRequestDispatcher("products.jsp");

        rd.forward(request, response);
    }
}