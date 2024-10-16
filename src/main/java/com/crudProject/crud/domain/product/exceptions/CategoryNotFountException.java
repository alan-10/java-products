package com.crudProject.crud.domain.product.exceptions;

public class CategoryNotFountException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public CategoryNotFountException() {
		super("Category not found.");
	}
	
	public CategoryNotFountException(String mensage) {
		super(mensage);
	}
	
	

}
