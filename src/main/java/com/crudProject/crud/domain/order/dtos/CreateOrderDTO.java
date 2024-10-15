package com.crudProject.crud.domain.order.dtos;

import java.time.Instant;

import com.crudProject.crud.domain.order.enuns.OrderStatus;

public class CreateOrderDTO {
	private Instant moment;
	private OrderStatus orderStatus;
	private Integer productAmount;
	private Long product_id;
	private Long client_id;

	public CreateOrderDTO() {
	}

	public CreateOrderDTO(Instant moment, OrderStatus orderStatus, Integer productAmount, Long product_id, Long client_id) {
		super();
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.productAmount = productAmount;
		this.product_id = product_id;
		this.client_id = client_id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(Integer productAmount) {
		this.productAmount = productAmount;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public Long getClient_id() {
		return client_id;
	}

	public void setClient_id(Long client_id) {
		this.client_id = client_id;
	}

}
