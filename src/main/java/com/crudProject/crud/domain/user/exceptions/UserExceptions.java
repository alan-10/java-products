package com.crudProject.crud.domain.user.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.crudProject.crud.infra.exceptions.GlobalExceptionHandler;

public class UserExceptions extends GlobalExceptionHandler {
	
	@ExceptionHandler(UserNotFountException.class)
	public ResponseEntity<?> handleUserNotFountException(UserNotFountException ex, WebRequest request) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
}
