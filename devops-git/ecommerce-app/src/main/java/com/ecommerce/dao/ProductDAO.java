package com.ecommerce.dao;

import java.util.ArrayList;
import java.util.List;

import com.ecommerce.model.Product;

public class ProductDAO {

    public List<Product> getProducts() {

        List<Product> products = new ArrayList<>();

        products.add(new Product(1,"Laptop",65000));
        products.add(new Product(2,"Smartphone",25000));
        products.add(new Product(3,"Headphones",1800));

        return products;
    }

}
