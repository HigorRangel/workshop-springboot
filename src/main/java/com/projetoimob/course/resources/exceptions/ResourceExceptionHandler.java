package com.projetoimob.course.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.projetoimob.course.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

//ControllerAdvice faz a interceptação para ser possível manipular as exceptions
@ControllerAdvice
public class ResourceExceptionHandler {
	
	//ANOTATION PARA SER CAPAZ DE INTERCEPTAR
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
	
		return ResponseEntity.status(status).body(err);
	}
}
