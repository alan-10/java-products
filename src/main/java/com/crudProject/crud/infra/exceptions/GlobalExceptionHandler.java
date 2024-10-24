package com.crudProject.crud.infra.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.crudProject.crud.domain.product.exceptions.CategoryNotFountException;
import com.crudProject.crud.domain.product.exceptions.HasNotProductInStockException;
import com.crudProject.crud.domain.product.exceptions.ProductNotFountException;
import com.crudProject.crud.domain.user.exceptions.UserNotFountException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserNotFountException.class)
	public ResponseEntity<ExceptionReturnFormat> handleUserNotFountException(UserNotFountException ex,
			WebRequest request) {
		ExceptionReturnFormat errorFormated = new ExceptionReturnFormat(ex.getMessage(), HttpStatus.NOT_FOUND);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorFormated);
	}

	@ExceptionHandler(ProductNotFountException.class)
	public ResponseEntity<ExceptionReturnFormat> handleProductNotFountExceptions(ProductNotFountException ex,
			WebRequest request) {
		ExceptionReturnFormat errorFormated = new ExceptionReturnFormat(ex.getMessage(), HttpStatus.NOT_FOUND);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorFormated);
	}

	@ExceptionHandler(CategoryNotFountException.class)
	public ResponseEntity<ExceptionReturnFormat> handleCategoryNotFount(CategoryNotFountException ex,
			WebRequest request) {
		ExceptionReturnFormat errorFormated = new ExceptionReturnFormat(ex.getMessage(), HttpStatus.NOT_FOUND);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorFormated);

	}

	@ExceptionHandler(HasNotProductInStockException.class)
	public ResponseEntity<ExceptionReturnFormat> HasNotProductInStock(HasNotProductInStockException ex,
			WebRequest request) {

		ExceptionReturnFormat errorFormated = new ExceptionReturnFormat(ex.getMessage(), HttpStatus.NOT_FOUND);

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorFormated);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleGlobalException(Exception ex, WebRequest request) {
		System.out.println("Error" + ex.getMessage()+ " "+   ex.getStackTrace());
		return new ResponseEntity<>("Ocorreu um erro interno no servidor.", HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
