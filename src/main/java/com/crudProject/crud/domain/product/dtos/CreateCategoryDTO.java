package com.crudProject.crud.domain.product.dtos;

public class CreateCategoryDTO {
	private String name;
	private String description;
	
	public CreateCategoryDTO() {}

	public CreateCategoryDTO(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	

}
