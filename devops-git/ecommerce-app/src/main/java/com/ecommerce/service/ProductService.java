package com.ecommerce.service;

import java.util.List;

import com.ecommerce.dao.ProductDAO;
import com.ecommerce.model.Product;

public class ProductService {

    private ProductDAO productDAO;

    public ProductService() {
        productDAO = new ProductDAO();
    }

    public List<Product> getAllProducts() {
        return productDAO.getProducts();
    }
}