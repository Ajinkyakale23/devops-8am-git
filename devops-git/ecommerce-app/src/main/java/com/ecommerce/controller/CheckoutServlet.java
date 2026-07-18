package com.ecommerce.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/checkout")
public class CheckoutServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String mobile = request.getParameter("mobile");
        String payment = request.getParameter("payment");

        HttpSession session = request.getSession();

        session.setAttribute("customerName", name);
        session.setAttribute("address", address);
        session.setAttribute("mobile", mobile);
        session.setAttribute("payment", payment);

        response.sendRedirect("order-success.jsp");
    }
}