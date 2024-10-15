package com.crudProject.crud.domain.product.dtos;

import com.crudProject.crud.domain.product.entities.Category;

public class CreateProductDTO {

	private String name;
	private String description;
	private Double price;
	private Integer quantity;
	private Boolean status = true;
	private Long categoryId;
	private Category category;

	public CreateProductDTO() {
	}

	public CreateProductDTO(String name, String description, Double price, Integer quantity, Boolean status,
			Long categoryId, Category category) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.status = status;
		this.categoryId = categoryId;
		this.category = category;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
