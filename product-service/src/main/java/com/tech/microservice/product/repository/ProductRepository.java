package com.tech.microservice.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.microservice.product.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
