package com.ecommerce.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        System.out.println("================================");
        System.out.println("E-Commerce Application Started");
        System.out.println("================================");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        System.out.println("================================");
        System.out.println("E-Commerce Application Stopped");
        System.out.println("================================");

    }
}