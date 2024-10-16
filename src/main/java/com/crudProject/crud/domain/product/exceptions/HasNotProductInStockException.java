package com.crudProject.crud.domain.product.exceptions;

public class HasNotProductInStock extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public HasNotProductInStock() {
		super("product out of stock");
	}

}
