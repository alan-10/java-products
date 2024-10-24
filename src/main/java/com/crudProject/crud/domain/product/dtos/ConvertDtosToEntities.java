package com.crudProject.crud.domain.product.dtos;

import com.crudProject.crud.domain.product.entities.Category;
import com.crudProject.crud.domain.product.entities.Product;

public class ConvertDtosToEntities {
	public static Product productEntity(CreateProductDTO createDTO) {
		return new Product(null, createDTO.getName(), createDTO.getDescription(), createDTO.getPrice(),
				createDTO.getQuantity(), createDTO.getStatus(), null, null, createDTO.getCategoryId(), null);
	}

	public static Category categoryEntity(CreateCategoryDTO createDTO) {
		return new Category(null, createDTO.getName(), createDTO.getDescription());
	}
}
