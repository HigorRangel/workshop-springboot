package com.projetoimob.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoimob.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
