package com.example.Supermarket.Service;

import com.example.Supermarket.Entity.Product;
import com.example.Supermarket.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {

    @Autowired
    public ProductRepo productRepo;

    public List<Product> getAll() {
        return productRepo.findAll();
    }

    public List<Product> getByCatagory(String catagory) {
        List<Product> productList = this.getAll();
        List<Product> resultProducts = new ArrayList<>();
        for (Product product : productList) {
            if (product.getCatagory().equals(catagory)) {
                resultProducts.add(product);
            }
        }
        return resultProducts;

    }
}
