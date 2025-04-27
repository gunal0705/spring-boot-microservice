package com.tech.microservice.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tech.microservice.product.model.Product;
import com.tech.microservice.product.repository.ProductRepository;

@Service

public class ProductService {

	private ProductRepository productRepo;

	public ProductService(ProductRepository productRepo) {
		super();
		this.productRepo = productRepo;
	}
	
	public Product createProduct(Product product) {
		return productRepo.save(product);
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}
	
	
}
