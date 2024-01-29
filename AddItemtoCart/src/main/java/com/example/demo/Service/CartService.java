package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.CartItem;
import com.example.demo.Entity.Product;
import com.example.demo.Repositary.CartItemRepository;
import com.example.demo.Repositary.CartRepository;
import com.example.demo.Repositary.ProductRepository;

@Service
public class CartService {
    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;
    private final ProductRepository productRepository;

    @Autowired
    public CartService(CartRepository cartRepository, CartItemRepository cartItemRepository,
                       ProductRepository productRepository) {
        this.cartRepository = cartRepository;
        this.cartItemRepository = cartItemRepository;
        this.productRepository = productRepository;
    }

    // Implement methods to add products to the cart, update quantities, etc.
    // Example:
    public void addProductToCart(Long productId, int quantity) {
        Product product = productRepository.findById(productId).orElse(null);
        if (product != null) {
            CartItem cartItem = new CartItem();
            cartItem.setProduct(product);
            cartItem.setQuantity(quantity);
            cartItemRepository.save(cartItem);
        }
    }
}
