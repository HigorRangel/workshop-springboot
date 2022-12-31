package com.projetoimob.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoimob.course.entities.User;

//o @Repository não é obrigatório porque já está herdando do JpaRepository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
