package com.crudProject.crud.domain.product.exceptions;

public class ProductNotFountException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ProductNotFountException() {
		super("Product not fount");
	}

	public ProductNotFountException(String message) {
		super(message);
	}
}
