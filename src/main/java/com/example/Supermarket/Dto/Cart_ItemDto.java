package com.example.Supermarket.Dto;

import com.example.Supermarket.Entity.Cart_Item;

public class Cart_ItemDto {
    private Integer id;
    private Integer productId;
    private Integer cartId;

    //Cart_item------>cartItemDto
    public static Cart_ItemDto createCart_ItemDto(Cart_Item cart_item) {
        Cart_ItemDto cart_itemDto = new Cart_ItemDto();
        cart_itemDto.setId(cart_item.getId());
        cart_itemDto.setCartId(cart_item.getCartId());
        cart_itemDto.setProductId(cart_item.getProductId());
        return cart_itemDto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Cart_ItemDto() {
    }

    public Cart_ItemDto(Integer id) {
        this.id = id;
    }
}
