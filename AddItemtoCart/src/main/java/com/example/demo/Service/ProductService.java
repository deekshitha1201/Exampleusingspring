package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Product;

@Service
public interface ProductService {

	Product addproduct(Product product);

	List<Product> getAll();

	String getproductbyid(Long id);

	String deltebyid(Long id);
	

}
