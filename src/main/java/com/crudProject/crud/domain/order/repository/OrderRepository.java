package com.crudProject.crud.domain.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudProject.crud.domain.order.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
