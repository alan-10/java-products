package com.crudProject.crud.domain.order.dtos;

import java.time.Instant;

import com.crudProject.crud.domain.order.enuns.OrderStatus;

public class CreateOrderDTO {
	private Instant moment;
	private OrderStatus orderStatus;
	private Integer productAmount;
	private Long productId;
	private Long clientId;

	public CreateOrderDTO() {
	}

	public CreateOrderDTO(Instant moment, OrderStatus orderStatus, Integer productAmount,Long clientId ,Long productId
			) {
		super();
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.productAmount = productAmount;
		this.productId = productId;
		this.clientId = clientId;
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

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long product_id) {
		this.productId = product_id;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long client_id) {
		this.clientId = client_id;
	}

}
