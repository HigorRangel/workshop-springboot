package com.projetoimob.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoimob.course.entities.User;

//Recurso web  que é implementado por um controlador REST 
@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Teste", "teste@email.com", "094235892", "12345");
		return ResponseEntity.ok().body(u);
	}
}
