package com.crudProject.crud.domain.product.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudProject.crud.domain.product.entities.Product;
import com.crudProject.crud.domain.product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository repository;

	public Product save(Product product) {
		return this.repository.save(product);
	}

	public void subtractProduct(Long id, Integer quantityProduct) {
		Product product = this.repository.getReferenceById(id);

		product.setQuantity(product.getQuantity() - quantityProduct);

		repository.save(product);
	}

	public void increaseProduct(Long id, Integer quantityProduct) {
		Product product = this.repository.getReferenceById(id);

		product.setQuantity(product.getQuantity() + quantityProduct);

		repository.save(product);
	}

	public List<Product> getLowStokProducts() {

		final Integer amountProduct = 11;

		List<Product> products = this.repository.findByQuantityLessThanEqual(amountProduct);

		return products;
	}

}
