package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Product;
import com.example.demo.Repositary.ProductRepository;

@Service
public class Productimpl implements ProductService {
	@Autowired
	private ProductRepository prorepo;

	@Override
	public Product addproduct(Product product) {
		return prorepo.save(product);
	}

	@Override
	public List<Product> getAll() {
		return prorepo.findAll();
	}

	@Override
	public String getproductbyid(Long id) {
		Optional<Product> p=prorepo.findById(id);
		if(p.isPresent())
		{
			p.get();
			return "suvcess";
		}else
		{
			return "not found";
		}
	}

	@Override
	public String deltebyid(Long id) {
		if(prorepo.existsById(id)) {
			prorepo.deleteById(id);
			return "deleted";
			
		}else {
			return "not foubd";
		}
	}

}
