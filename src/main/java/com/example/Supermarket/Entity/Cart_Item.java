package com.example.Supermarket.Entity;

import com.example.Supermarket.Dto.Cart_ItemDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart_Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer productId;
    private Integer cartId;

    //Cart_ItemDto----->CartItem
    public static Cart_Item createCart_item(Cart_ItemDto cart_itemDto) {
        Cart_Item cart_item = new Cart_Item();
        cart_item.setId(cart_itemDto.getId());
        cart_item.setProductId(cart_itemDto.getProductId());
        cart_item.setCartId(cart_itemDto.getCartId());
        return cart_item;
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

    public void setProductId(Integer userId) {
        this.productId = userId;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Cart_Item() {
    }

    public Cart_Item(Integer id) {
        this.id = id;
    }
}
