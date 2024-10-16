package com.crudProject.crud.domain.product.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudProject.crud.domain.product.entities.Category;
import com.crudProject.crud.domain.product.entities.Product;
import com.crudProject.crud.domain.product.exceptions.CategoryNotFountException;
import com.crudProject.crud.domain.product.exceptions.ProductNotFountException;
import com.crudProject.crud.domain.product.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository ProductRepository;

	@Autowired
	CategoryService categoryService;

	public Product save(Product product) {

		Category category = this.categoryService.findById(product.getCategoryId());

		if (category == null) {
			throw new CategoryNotFountException();
		}

		return this.ProductRepository.save(product);
	}

	public void subtractProduct(Long id, Integer quantityProduct) {
		Product product = this.ProductRepository.getReferenceById(id);

		product.setQuantity(product.getQuantity() - quantityProduct);

		ProductRepository.save(product);
	}

	public void increaseProduct(Long id, Integer quantityProduct) {
		Product product = this.ProductRepository.findById(id).orElse(null);

		if (product == null) {
			throw new ProductNotFountException();
		}

		product.setQuantity(product.getQuantity() + quantityProduct);

		ProductRepository.save(product);
	}

	public List<Product> getLowStokProducts() {

		final Integer amountProduct = 11;

		List<Product> products = this.ProductRepository.findByQuantityLessThanEqual(amountProduct);

		return products;
	}

}
