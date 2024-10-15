package com.crudProject.crud.domain.product.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
////@NoArgsConstructor
////@AllArgsConstructor
public class IncreaseProductDTO {
	
	private Integer quantityProduct;
	
	
	public IncreaseProductDTO() {}


	public IncreaseProductDTO(Integer quantityProduct) {
		super();
		this.quantityProduct = quantityProduct;
	}


	public Integer getQuantityProduct() {
		return quantityProduct;
	}


	public void setQuantityProduct(Integer quantityProduct) {
		this.quantityProduct = quantityProduct;
	}


	@Override
	public String toString() {
		return "IncreaseProductDTO [quantityProduct=" + quantityProduct + "]";
	}
	
	
	
	
	

	
}
