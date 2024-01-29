package com.example.demo.Repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}

