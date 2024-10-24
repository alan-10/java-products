package com.crudProject.crud.domain.product.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudProject.crud.domain.product.entities.Category;
import com.crudProject.crud.domain.product.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public Category save(Category category) {
		return this.repository.save(category);
	}

	public Category findById(Long id) {
		Optional<Category> category = this.repository.findById(id);

		return category.orElse(null);
	}

}
