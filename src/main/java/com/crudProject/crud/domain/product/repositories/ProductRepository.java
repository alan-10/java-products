package com.crudProject.crud.domain.product.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudProject.crud.domain.product.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	   List<Product> findByQuantityLessThanEqual(Integer quantity);
}
