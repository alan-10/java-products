package com.crudProject.crud.domain.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudProject.crud.domain.product.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long > {

}
