package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
