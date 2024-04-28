package com.Spring.JPA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.JPA.Entity.Product;
import com.Spring.JPA.Repository.ProductRepository;

@Service
public class ProductService {

	
	@Autowired
	ProductRepository productrepository;
	
	public List<Product> getAll(){
		return productrepository.findAll();
	}
	
	public Product addProduct(Product product) {
		return productrepository.save(product);
	}
	
	public Product getProductbyID(int id) {
		return productrepository.findById(id).get();
		}
	
}
