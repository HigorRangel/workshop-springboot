package com.projetoimob.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoimob.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
