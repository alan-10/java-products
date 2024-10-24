package com.crudProject.crud.domain.product.dtos;

import java.time.Instant;

import com.crudProject.crud.domain.order.enuns.OrderStatus;
import com.crudProject.crud.domain.product.entities.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateProductDTO {	

	private String name;
	private String description;
	private Double price;
	private Integer quantity;
	private Boolean status = true;
	private Long categoryId;
	private Category category;



}
