package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Product;
import com.example.demo.Service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService ps;
	@PostMapping("/createrecord")
	public ResponseEntity<Product> createproduct(@RequestBody Product product)
	{
		return new ResponseEntity<Product>(ps.addproduct(product),HttpStatus.CREATED);
		
	}
	@GetMapping("/retreiveall")
	public ResponseEntity<List<Product>> getallrecord()
	{
		return new ResponseEntity<List<Product>>(ps.getAll(),HttpStatus.OK);
	}
	@GetMapping("{id}")
	public ResponseEntity<String> getbyidva(@PathVariable Long id)
	{
		return new ResponseEntity<String>(ps.getproductbyid(id),HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deteid(@PathVariable Long id)
	{
		return new ResponseEntity<String>(ps.deltebyid(id),HttpStatus.OK);
	}

}
