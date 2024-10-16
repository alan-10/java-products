package com.crudProject.crud.infra.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.crudProject.crud.domain.product.exceptions.CategoryNotFountException;
import com.crudProject.crud.domain.product.exceptions.HasNotProductInStock;
import com.crudProject.crud.domain.product.exceptions.ProductNotFountException;
import com.crudProject.crud.domain.user.exceptions.UserNotFountException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserNotFountException.class)
	public ResponseEntity<?> handleUserNotFountException(UserNotFountException ex, WebRequest request) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(ProductNotFountException.class)
	public ResponseEntity<?> handleProductNotFountExceptions(ProductNotFountException ex, WebRequest request) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(CategoryNotFountException.class)
	public ResponseEntity<?> handleCategoryNotFount(CategoryNotFountException ex, WebRequest request) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);

	}
	
	@ExceptionHandler(HasNotProductInStock.class)
	public ResponseEntity<?> HasNotProductInStock(HasNotProductInStock ex, WebRequest request){
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleGlobalException(Exception ex, WebRequest request) {
		System.out.println("Error" + ex.getStackTrace());
		return new ResponseEntity<>("Ocorreu um erro interno no servidor.", HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
