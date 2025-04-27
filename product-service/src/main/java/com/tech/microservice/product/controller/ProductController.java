package com.tech.microservice.product.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tech.microservice.product.model.Product;

@RestController
@RequestMapping("api/product")
public class ProductController {
	
	private com.tech.microservice.product.service.ProductService ProductService;
	
	public ProductController(com.tech.microservice.product.service.ProductService productService) {
		super();
		ProductService = productService;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	private Product createProduct(@RequestBody Product product) {
		return ProductService.createProduct(product);
	}
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	private List<Product> getAllProducts(){
		return ProductService.getAllProducts();
	}
}
