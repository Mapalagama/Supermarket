package com.example.Supermarket.Repo;

import com.example.Supermarket.Entity.Cart_Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Cart_ItemRepo extends JpaRepository<Cart_Item , Integer> {
}
