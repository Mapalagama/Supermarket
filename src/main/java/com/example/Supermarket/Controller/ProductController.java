package com.example.Supermarket.Controller;

import com.example.Supermarket.Dto.ProductDto;
import com.example.Supermarket.Entity.Product;
import com.example.Supermarket.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<ProductDto> getAll() {
        List<Product> productList = productService.getAll();
        List<ProductDto> productDtoList = new ArrayList<>();
        for (Product product : productList){
            ProductDto productDto = ProductDto.createProductDto(product);
            productDtoList.add(productDto);
        }
        return productDtoList;
    }

    @GetMapping("/{catagory}")
    public List<ProductDto> getByCatagory(@PathVariable String catagory){
        List<ProductDto> productDtoList = new ArrayList<>();
        List<Product> productList = productService.getByCatagory(catagory);
        for (Product product:productList){
            ProductDto productDto = ProductDto.createProductDto(product);
            productDtoList.add(productDto);
        }
        return productDtoList;
    }
}
