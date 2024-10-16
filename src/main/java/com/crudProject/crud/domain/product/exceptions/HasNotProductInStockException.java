package com.crudProject.crud.domain.product.exceptions;

public class HasNotProductInStockException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public HasNotProductInStockException() {
		super("product out of stock");
	}

}
