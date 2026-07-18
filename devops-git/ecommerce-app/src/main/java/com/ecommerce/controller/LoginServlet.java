package com.ecommerce.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if ("admin@gmail.com".equals(email)
                && "admin123".equals(password)) {

            HttpSession session = request.getSession();
            session.setAttribute("username", email);

            response.sendRedirect("products");

        } else {

            request.setAttribute("error",
                    "Invalid Email or Password");

            request.getRequestDispatcher("login.jsp")
                    .forward(request, response);
        }
    }
}