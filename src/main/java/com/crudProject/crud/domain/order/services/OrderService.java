package com.crudProject.crud.domain.order.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudProject.crud.domain.order.entities.Order;
import com.crudProject.crud.domain.order.repository.OrderRepository;
import com.crudProject.crud.domain.product.repository.ProductRepository;
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
		
		System.out.println("orderCreated 1: " + order);

		Order orderCreated = this.repository.save(order);
		
		System.out.println("orderCreated: " + orderCreated);

		this.productService.subtractProduct(orderCreated.getProductId(), orderCreated.getProductAmount());
		return orderCreated;
	}

}
