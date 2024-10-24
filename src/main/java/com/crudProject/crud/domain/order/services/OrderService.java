package com.crudProject.crud.domain.order.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudProject.crud.domain.order.entities.Order;
import com.crudProject.crud.domain.order.repository.OrderRepository;
import com.crudProject.crud.domain.product.entities.Product;
import com.crudProject.crud.domain.product.exceptions.HasNotProductInStockException;
import com.crudProject.crud.domain.product.exceptions.ProductNotFountException;
import com.crudProject.crud.domain.product.repositories.ProductRepository;
import com.crudProject.crud.domain.product.services.ProductService;
import com.crudProject.crud.domain.user.entities.User;
import com.crudProject.crud.domain.user.exceptions.UserNotFountException;
import com.crudProject.crud.domain.user.repositories.UserRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository repository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	ProductRepository productRepository;

	@Autowired
	ProductService productService;

	public List<Order> findAll() {
		return this.repository.findAll();
	}

	public Order findBYId(Long id) {
		Optional<Order> order = this.repository.findById(id);

		return order.get();
	}

	public Order create(Order order) {

		Optional<Product> product = this.productRepository.findById(order.getProductId());

		Optional<User> client = this.userRepository.findById(order.getClientId());

		if (!product.isPresent()) {
			throw new ProductNotFountException();
		}

		if (!client.isPresent()) {
			throw new UserNotFountException();
		}

		Boolean hasProductInStock = this.productService.hasProductInStock(order.getProductId(), order.getProductAmount());

		if (!hasProductInStock) {
			throw new HasNotProductInStockException();
		}

		Order orderCreated = this.repository.save(order);

		this.productService.subtractProduct(orderCreated.getProductId(), orderCreated.getProductAmount());
		return orderCreated;
	}

}
