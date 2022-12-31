package com.projetoimob.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoimob.course.entities.Product;
import com.projetoimob.course.repositories.ProductRepository;

@Service
public class ProductService {
		
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	public Product findProductById(Long id) {
		Optional<Product> opt = productRepository.findById(id);
		return opt.get();
	}
}
