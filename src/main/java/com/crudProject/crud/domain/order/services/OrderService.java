package com.crudProject.crud.domain.order.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudProject.crud.domain.order.entities.Order;
import com.crudProject.crud.domain.order.repository.OrderRepository;
import com.crudProject.crud.domain.product.repositories.ProductRepository;
import com.crudProject.crud.domain.product.services.ProductService;

@Service
public class OrderService {

	@Autowired
	OrderRepository repository;

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

		Order orderCreated = this.repository.save(order);

		this.productService.subtractProduct(orderCreated.getProductId(), orderCreated.getProductAmount());
		return orderCreated;
	}

}
