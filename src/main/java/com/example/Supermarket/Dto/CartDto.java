package com.example.Supermarket.Dto;

import com.example.Supermarket.Entity.Cart;

import java.util.ArrayList;
import java.util.List;

public class CartDto {
    private Integer id;
    private Integer userId;
    private String status;

    //Cart----->CartDto
    public static CartDto createCartDto(Cart cart) {
        CartDto cartDto = new CartDto();
        cartDto.setId(cart.getId());
        cartDto.setUserId(cart.getUserId());
        cartDto.setStatus(cart.getStatus());
        return cartDto;
    }

    //CartList----->Cart:istDto
    public static List<CartDto> createCartDtos(List<Cart> cartList) {
        List<CartDto> cartDtoList = new ArrayList<>();
        for (Cart cart : cartList) {
            CartDto cartDto = createCartDto(cart);
            cartDtoList.add(cartDto);
        }
        return cartDtoList;
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

    public CartDto() {
    }

    public CartDto(Integer id) {
        this.id = id;
    }
}
