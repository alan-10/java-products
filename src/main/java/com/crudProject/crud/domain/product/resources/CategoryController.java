package com.crudProject.crud.domain.product.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudProject.crud.domain.product.entities.Category;
import com.crudProject.crud.domain.product.services.CategoryService;

@RestController
@RequestMapping("category")
public class CategoryController {
	
	@Autowired
	private CategoryService service;
	
	@PostMapping()
	public ResponseEntity<Category> insert(@RequestBody Category body) {
		Category newCategory =  this.service.save(body);
		return ResponseEntity.ok().body(newCategory);
	}

}