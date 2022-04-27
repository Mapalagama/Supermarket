package com.example.Supermarket.Controller;

import com.example.Supermarket.Dto.CartDto;
import com.example.Supermarket.Dto.Cart_ItemDto;
import com.example.Supermarket.Entity.Cart;
import com.example.Supermarket.Entity.Cart_Item;
import com.example.Supermarket.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping()
    public List<CartDto> getAll() {
        List<Cart> cartList = cartService.getAll();
        List<CartDto>cartDtoList =CartDto.createCartDtos(cartList);
        return cartDtoList;
    }

    @PostMapping
    public CartDto createCart(@RequestBody Cart cart) {
        Cart cart1 = cartService.createCart(cart);
        CartDto cartDto = CartDto.createCartDto(cart1);
        return cartDto;
    }

    @PostMapping("/add")
    public Cart_ItemDto addItem(@RequestBody Cart_Item cart_item) {
        Cart_Item cart_item1 = cartService.addItem(cart_item);
        Cart_ItemDto cart_itemDto = Cart_ItemDto.createCart_ItemDto(cart_item1);
        return cart_itemDto;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteItem(@PathVariable Integer id) {
        cartService.deleteItem(id);
    }

    @PostMapping("/{id}/process")
    @ResponseStatus(HttpStatus.OK)
    public CartDto submitCart(@PathVariable Integer id) {
        Cart cart = cartService.submitCart(id);
        CartDto cartDto = CartDto.createCartDto(cart);
        return cartDto;
    }
}
