package com.example.Supermarket.Entity;


import com.example.Supermarket.Dto.CartDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer userId;
    private String status;

    //CartDto------>Cart
    public static Cart createCart(CartDto cartDto){
        Cart cart = new Cart();
        cart.setId(cartDto.getId());
        cart.setUserId(cartDto.getUserId());
        cart.setStatus(cartDto.getStatus());
        return cart;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cart() {
    }

    public Cart(Integer id) {
        this.id = id;
    }
}
