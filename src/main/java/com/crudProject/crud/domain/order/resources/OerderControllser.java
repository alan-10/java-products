package com.crudProject.crud.domain.order.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudProject.crud.domain.order.entities.Order;
import com.crudProject.crud.domain.order.services.OrderService;


@RestController
@RequestMapping("/order")
public class OerderControllser {
	
	@Autowired
	OrderService service;

	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> orders = this.service.findAll();
		return ResponseEntity.ok().body(orders);	
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order order = this.service.findBYId(id);
		
		return ResponseEntity.ok().body(order);
	}
	
	
	@PostMapping
	public ResponseEntity<Order> insert(@RequestBody Order body){
		
		System.out.println("body + " + body);
		Order order = this.service.create(body);
		
		return ResponseEntity.ok().body(order);
	}
	
}
