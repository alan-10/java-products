package com.crudProject.crud.domain.product.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateCategoryDTO {
	private String name;
	private String description;
	
}
