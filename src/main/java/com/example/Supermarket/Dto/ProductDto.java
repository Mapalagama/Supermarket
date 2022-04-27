package com.example.Supermarket.Dto;

import com.example.Supermarket.Entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDto {
    private Integer id;
    private String name;
    private String catagory;

    //Product----->ProductDto
    public static ProductDto createProductDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setCatagory(product.getCatagory());
        return productDto;
    }

    //ProductList----->ProductListDto
    public static List<ProductDto> createProductDtos(List<Product> productList) {
        List<ProductDto> productDtos = new ArrayList<>();
        for (Product product : productList) {
            ProductDto productDto = createProductDto(product);
            productDtos.add(productDto);
        }
        return productDtos;
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

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public ProductDto() {
    }

    public ProductDto(Integer id) {
        this.id = id;
    }
}
