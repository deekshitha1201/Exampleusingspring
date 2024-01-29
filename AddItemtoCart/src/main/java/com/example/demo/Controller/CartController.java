package com.example.demo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/addProduct")
    public void addProductToCart(@RequestParam Long productId, @RequestParam int quantity) {
        cartService.addProductToCart(productId, quantity);
    }
    
}
