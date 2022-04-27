package com.example.Supermarket.Service;

import com.example.Supermarket.Entity.Cart;
import com.example.Supermarket.Entity.Cart_Item;
import com.example.Supermarket.Repo.CartRepo;
import com.example.Supermarket.Repo.Cart_ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CartService {
    @Autowired
    private CartRepo cartRepo;
    @Autowired
    private Cart_ItemRepo cart_itemRepo;

    public Cart createCart(Cart cart) {
        cart.setStatus("Order PendingAfter");
        return cartRepo.save(cart);
    }
    public List<Cart> getAll(){
        return cartRepo.findAll();
    }

    public Cart_Item addItem(Cart_Item cart_item) {
        return cart_itemRepo.save(cart_item);

    }

    public void deleteItem(Integer cart_ItemId) {
        cart_itemRepo.deleteById(cart_ItemId);
    }

    public Cart submitCart(Integer cartId) {
        Cart cart = cartRepo.getById(cartId);
        cart.setStatus("Oder processing");
        return cart;
    }

}
