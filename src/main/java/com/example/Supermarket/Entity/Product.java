package com.example.Supermarket.Entity;

import com.example.Supermarket.Dto.ProductDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String catagory;

    //ProductDto---->Product
    public static Product createProduct(ProductDto productDto) {
        Product product = new Product();
        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setCatagory(productDto.getCatagory());
        return product;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catogory) {
        this.catagory = catogory;
    }

    public Product() {
    }

    public Product(Integer id) {
        this.id = id;
    }
}
