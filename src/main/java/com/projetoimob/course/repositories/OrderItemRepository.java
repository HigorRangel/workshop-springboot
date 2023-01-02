package com.projetoimob.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoimob.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
